/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testbank;
import java.util.*;
/**
 *
 * @author Albert
 */
public class TestBank {

    public static void main(String[] args) {
        bankAccount bankAccount1 = new bankAccount("Albert", 10.0, "1234567891");
        
        bankAccount1.displayInfo();
        
        System.out.println("Enter the amount to deposit: ");
        double depositAmount = scanDouble();
        bankAccount1.depositMoney(depositAmount);
        
        System.out.println("Enter the amount to withdraw: ");
        double withdrawAmount = scanDouble();
        bankAccount1.withdrawMoney(withdrawAmount);
        
        System.out.println("Updated Balance: " + bankAccount1.checkBalance());
        
        System.out.println("Enter the number of years to calculate interest: ");
        int years = scanInt();
        double interest = bankAccount1.calculateInterest(years);
        System.out.println("Interest earned over " + years + " years: " + interest);
        
        bankAccount bankAccount2 = new bankAccount( "12345", 1000.0, "John Doe");
        bankAccount2.depositMoney(500.0);
        bankAccount2.withdrawMoney(200.0);

        System.out.println("Current Balance: " + bankAccount2.checkBalance());

        bankAccount2.setOwnerName("Jane Doe");
        System.out.println("New Owner Name: " + bankAccount2.getOwnerName());
        System.out.println("Interest: " + bankAccount2.calculateInterest());

        ArrayList<bankAccount> accountsArrayList = new ArrayList<>();
        LinkedList<bankAccount> accountsLinkedList = new LinkedList<>();

        
        bankAccount[] account = {account("Peter Smith", 1500.0,"67890")
                                ,account("John Doe", 1500.0,"1235435")
                                ,account("Jane Doe", 1500.0,"27368273")};
        
        for(int i = 0; i < account.length; i++){
            accountsArrayList.add(account[i]);
        }
        
        //Remove
        accountsArrayList.remove(1);
        accountsLinkedList.removeFirst();

        
        accountsArrayList.add(1, account("Mary Johnson", 123576, "123783687"));
        accountsLinkedList.add(1, new bankAccount("David Williams", 948234, "683209"));

    } 
        private static bankAccount account(String ownerName, double balance, String accountNumber){
            return new bankAccount(ownerName, balance, accountNumber);
        }
        public static String scanNextLine(){Scanner s = new Scanner(System.in); return s.nextLine();}
        public static int scanInt(){Scanner s = new Scanner(System.in); return s.nextInt();}
        public static double scanDouble(){Scanner s = new Scanner(System.in); return s.nextDouble();}

}
