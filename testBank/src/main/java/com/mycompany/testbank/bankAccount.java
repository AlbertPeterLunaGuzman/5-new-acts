/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testbank;
import java.util.*;
/**
 *
 * @author Albert
 */
public class bankAccount {
    
    private String ownerName;
    private double balance, amount;
    private String accountNumber;
    private static final double interestRate = 0.01;
    
    public bankAccount() {this("", 0, "");}
    
    public bankAccount(String ownerName, double balance, String accountNumber) {
        this.ownerName = ownerName; this.balance = balance; this.accountNumber = accountNumber;
    }
    
    public void userPrompt() {
        System.out.println("Enter account number: ");
        String enteredAccountNumber = scan().nextLine();
        if (enteredAccountNumber.equals(accountNumber)) {
            whenCorrect(enteredAccountNumber);
        }
    }

    public void whenCorrect(String accountNumber) {
        if (accountNumber.equalsIgnoreCase(accountNumber)) {
            System.out.println("Would you like to deposit or withdraw");
            String choice = scan().nextLine();
            if (choice.equalsIgnoreCase("deposit")) {
                System.out.println("Enter the amount to deposit: ");
                double depositAmount = scan().nextDouble();
                depositMoney(depositAmount);
            } else if (choice.equalsIgnoreCase("withdraw")) {
                System.out.println("Enter the amount to withdraw: ");
                double withdrawAmount = scan().nextDouble();
                withdrawMoney(withdrawAmount);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    public Scanner scan(){return new Scanner(System.in);}
    
    //Getters
    public String getOwnerName() {return this.ownerName;}
    public double getBalance() {return this.balance;}
    public String getAccountNumber() {return this.accountNumber;}
    
    // Setters
    public void setOwnerName(String ownerName) {this.ownerName = ownerName;}
    public void setBalance(double balance) {this.balance = balance;}
    public void setAccountNumber(String accountNumber) {this.accountNumber = accountNumber;}
    
    //Display
    public void displayInfo(){
        System.out.println("Owner name: " + ownerName + 
                           "\nBalance: " + balance + 
                           "\nAccount number: " + accountNumber);
    }
    
    // Deposit
    public void depositMoney(double depositAmount) {
        if (depositAmount > 0) {
            this.balance += depositAmount;
            System.out.println("Successfully deposited: " + depositAmount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    // Withdraw
    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    
    // check Balance
    public double checkBalance() {return this.balance;}
    
    //calculate Interest
    public double calculateInterest() {return this.balance * interestRate;}
    
    // calculate Interest/Years
    public double calculateInterest(int years) {
        double p, r, n, interest;
        p = this.balance; r = interestRate; n = years;
        interest = p * r * n;
        return interest;}
}
