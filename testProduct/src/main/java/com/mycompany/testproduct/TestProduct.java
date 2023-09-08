/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testproduct;
import java.util.*;
/**
 *
 * @author Albert
 */
public class TestProduct {

    public static void main(String[] args) {
        product product = new product ("HatDawg", 250, "Masarap");
        product.displayProductInfo();
        product.displayDiscount(product.applyDiscount(50));
        
        System.out.println("");
        product product2 = new product("", 0, "");
        product2.setName("Fried Chicken");
        product2.setPrice(-1);
        product2.setDescription("Masarap den parang HatDawg");
        product2.displayProductInfo();
        
    }
    private static Scanner scan(){return new Scanner(System.in);}
    
    private static String newProductName(Scanner scan){
        System.out.print("Enter the new name of product: "); String newName = scan.nextLine();
        return newName;
    }
}
