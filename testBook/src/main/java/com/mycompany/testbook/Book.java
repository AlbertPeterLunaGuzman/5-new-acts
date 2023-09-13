/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testbook;

/**
 *
 * @author Albert
 */
public class Book {
    
    private String title, author, publisher, ISBN;
    private static int BOOK_COUNT = 0;
    
    public Book (String[] info){performThis(info);}
    
    public void performThis(String[] info){ 
        this.title = info[0];
        this.author = info[1];
        this.publisher = info[2];
        this.ISBN = info[3]; 
        increaseBOOK_COUNT();
    }
    //Getters
    public String getTitle(){return title;} 
    public String getAuthor(){return author;} 
    public String getPublisher(){return this.publisher = publisher;} 
    public String getISBN(){return ISBN;}
    public static int getBOOK_COUNT(){return BOOK_COUNT;}
    
    //Setters
    public String setTitle(String title){return this.title = title;} 
    public String setAuthor(String author){return this.author = author;} 
    public String setPublisher(String publisher){return this.publisher = publisher;} 
    public String setISBN(String ISBN){return this.ISBN = ISBN;}
    
    //Display
    public void displayBookInfo(){
        System.out.println("Book title: " + title + 
                            "\nBook author: " + author + 
                            "\nBook publisher: " + publisher + 
                            "\nBook ISBN: " + ISBN);
    }
    private static int increaseBOOK_COUNT(){return BOOK_COUNT++;}
}
