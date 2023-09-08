/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testbook;
import java.util.*;
/**
 *
 * @author Albert
 */
public class bookSearch {
    public bookSearch(){}
    
    public Book byTitle(Book[] bookRecord){
        Scanner s = new Scanner(System.in); System.out.print("\nEnter the title that you are looking for: ");
        String enteredTitle = s.nextLine();
        int index = -1;
        for(int i = 0; i < bookRecord.length; i++){
            if(bookRecord[i].getTitle().equalsIgnoreCase(enteredTitle)){
                index = i;
                break;
            }
        }
        if(index != -1){System.out.println("\nThere is a Record of that book \nHere is the details for that Book: \n"); bookRecord[index].displayBookInfo();} 
        else{System.out.println("Sorry but there is not Record Found for that book");}
        return bookRecord[index];
    }
    public Book byAuthor(Book[] bookRecord){
        Scanner s = new Scanner(System.in); System.out.print("\nEnter the name of the author that you are looking for: ");
        String enteredAuthorName = s.nextLine();
        int index = -1;
        for(int i = 0; i < bookRecord.length; i++){
            if(bookRecord[i].getAuthor().equalsIgnoreCase(enteredAuthorName)){
                index = i;
                break;
            }
        }
        if(index != -1){System.out.println("\nThere is a Record of that book \nHere is the details for that Book: \n"); bookRecord[index].displayBookInfo();} 
        else{System.out.println("Sorry but there is not Record Found for that book");}
        return bookRecord[index];
    }
    public Book byPublisher(Book[] bookRecord){
        Scanner s = new Scanner(System.in); System.out.print("\nEnter the name of the publisher that you are looking for: ");
        String enteredPublisherrName = s.nextLine();
        int index = -1;
        for(int i = 0; i < bookRecord.length; i++){
            if(bookRecord[i].getPublisher().equalsIgnoreCase(enteredPublisherrName)){
                index = i;
                break;
            }
        }
        if(index != -1){System.out.println("\nThere is a Record of that book \nHere is the details for that Book: \n"); bookRecord[index].displayBookInfo();} 
        else{System.out.println("Sorry but there is not Record Found for that book");}
        return bookRecord[index];
    }
    
    public Book byISBN(Book[] bookRecord){
        Scanner s = new Scanner(System.in); System.out.print("\nEnter the ISBN of the book that you are looking for: ");
        String enteredISBN = s.nextLine();
        int index = -1;
        for(int i = 0; i < bookRecord.length; i++){
            if(bookRecord[i].getISBN().equalsIgnoreCase(enteredISBN)){
                index = i;
                break;
            }
        }
        if(index != -1){System.out.println("\nThere is a Record of that book \nHere is the details for that Book: \n"); bookRecord[index].displayBookInfo();} 
        else{System.out.println("Sorry but there is not Record Found for that book");}
        return bookRecord[index];
    }
}
