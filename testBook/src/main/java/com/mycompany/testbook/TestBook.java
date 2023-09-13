/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testbook;
import java.util.*;
/**
 *
 * @author Albert
 */
public class TestBook {

    public static void main(String[] args){
        TestBook.temporaryInProgress();
    }
    
    private static Scanner scanner(){return new Scanner(System.in);}
    private static void activity1(){
        System.out.println("Original Book Info.");
        String[] info1 = {"How to make the doe.", "John Doe", "DEA publishing Co.", "12345"};
        Book book1 = new Book (info1); 
        book1.displayBookInfo();
        
        System.out.println("\nSecond Original Book Info.");
        String[] info2 = {"Plain Jane", "Jane Doe", "Book publishing Co.", "67891"};
        Book book2 = new Book (info2); 
        book2.displayBookInfo();
        
        System.out.println("\nUsing setter methods.");
        book1.setTitle("hello world");
        book1.setAuthor("Anon");
        book1.setPublisher("Anon publishing Co.");
        book1.setISBN("12345");
        book1.displayBookInfo();
        
        System.out.println("Using Getters: \n");
        System.out.println("Getting title from book1: " + book1.getTitle());
        System.out.println("Getting Author from book2: " + book2.getAuthor());
        
        System.out.println("\nTotal No. of Created books: " + Book.getBOOK_COUNT());
    
    }
    private static void temporaryInProgress(){
        String[] info1 = {"How to make the doe.", "John Doe", "DEA publishing Co.", "12345"};
        String[] info2 = {"Plain Jane.", "Jane Doe", "NWA Publishing Co.", "67891"};
        String[] info3 = {"Don't Touch My Source Pit.", "Peter Smith", "Death Row Records and Publishing Co.", "11121"};
        String[] info4 = {"Mary & Juana Rolls.", "Mary Johnson", "AmeriKKKa's Most Wanted Publishing Co.", "31415"};
        String[] info5 = {"The King Pin.", "David Williams", "Ruthless Publishing Co.", "16171"};
        String[] info6 = {"Montage Of a Heck: Part 1", "Brett Morgen", "Omnibus Press; 1st edition", "‎978-1783059669"};
        String[] info7 = {"Montage Of a Heck: Part 2", "Brett Morgen", "Omnibus Press; 1st edition", "‎978-1783059669"};
        String[] info8 = {"Montage Of a Heck: Part 3", "Brett Morgen", "Omnibus Press; 1st edition", "‎978-1783059669"};
        String[] info9 = {"Montage Of a Heck: Part 4", "Brett Morgen", "Omnibus Press; 1st edition", "‎978-1783059669"};
        String[] info10 = {"Montage Of a Heck: Part 5", "Brett Morgen", "Omnibus Press; 1st edition", "‎978-1783059669"};
        
        Book book1 = new Book (info1); 
        Book book2 = new Book (info2); 
        Book book3 = new Book(info3); 
        Book book4 = new Book(info4); 
        Book book5 = new Book(info5);
        Book book6 = new Book (info6); 
        Book book7 = new Book (info7); 
        Book book8 = new Book(info8); 
        Book book9 = new Book(info9); 
        Book book10 = new Book(info10);
        
        Book[] bookRecord = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};
        Book[] Books = new Book[bookRecord.length];
        
        for(int i = 0; i < Books.length; i++){
            Books[i] = bookRecord[i];
        }
        
        userPrompt userPrompt = new userPrompt(Books, scanner());
        userPrompt.startOfBookProgram();
    }
}
