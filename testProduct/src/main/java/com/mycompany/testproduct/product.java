/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testproduct;

/**
 *
 * @author Albert
 */
public class product {
    private String name, description;
    private double price;
    public product (String name, double price, String description){
        this.name = name; this.price = price; this.description = description;
    }
    
    //Getters
    public String getName(){return name;}
    public double getPrice(){return price;}
    public String getDescription(){return description;}
    
    //Setters
    public void setName(String name){this.name = name;}
    
    public void setPrice(double price) {
        try {
            if (price <= 0) { System.out.println("");
                throw new IllegalArgumentException("Price cannot be negative");
            }
            this.price = price;
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.exit(0); 
        }
    }
    public void setPrice(int price) {
        try {
            if (price <= 0) {System.out.println("");
                throw new IllegalArgumentException("Price cannot be negative");
            }
            this.price = price;
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.exit(0); 
        }
    }
    public void setPrice(float price) {
        try {
            if (price <= 0) {System.out.println("");
                throw new IllegalArgumentException("Price cannot be negative");
            }
            this.price = price;
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.exit(0); 
        }
    }
    public void setDescription(String descriptiom){this.description = descriptiom;}
    
    //Display
    public void displayProductInfo(){
        System.out.println("Product name: " + name + "\nPrice: " + price + "\nProduct description: " + description);
    }
    public void displayDiscount(double discount){System.out.println(name + " discounted price is: " + discount);}
    
    //discount
    public double applyDiscount(double discountPercentage){
        return price - ( price * (discountPercentage / 100.00));
    }


}