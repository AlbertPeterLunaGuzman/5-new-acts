/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testbook;

/**
 *
 * @author Albert
 */
public class bookSort {
    public bookSort(){
    
    }
    //Sort by title
    public void bubbleSortByTitle_Ascending(Book[] bookRecord){
    for(int i = 0; i < bookRecord.length - 1; i++){
            for(int j = 0; j < bookRecord.length - i - 1; j++){
                if(bookRecord[j].getTitle().compareToIgnoreCase(bookRecord[j + 1].getTitle()) > 0){
                    Book t = bookRecord[j];
                    bookRecord[j] = bookRecord[j + 1];
                    bookRecord[j + 1] = t;
                }
            }
        }
        printSortedByTitleOfBooksIn_AscendingOrder(bookRecord);
    }
    public void bubbleSortByTitle_Descending(Book[] bookRecord){
    for(int i = 0; i < bookRecord.length - 1; i++){
            for(int j = 0; j < bookRecord.length - i - 1; j++){
                if(bookRecord[j].getTitle().compareToIgnoreCase(bookRecord[j + 1].getTitle()) < 0){
                    Book t = bookRecord[j];
                    bookRecord[j] = bookRecord[j + 1];
                    bookRecord[j + 1] = t;
                }
            }
        }
    printSortedTitlByOfBooksIn_DescendingOrder(bookRecord);
    }
    private void printSortedByTitleOfBooksIn_AscendingOrder(Book[] bookRecord){
        System.out.println("List Of Books Sorted By Title Alpabetically: (Ascending)");
        for (Book book : bookRecord) {
            System.out.println("");
            book.displayBookInfo();
        }
    }
    private void printSortedTitlByOfBooksIn_DescendingOrder(Book[] bookRecord){
        System.out.println("List Of Books Sorted By Title Alpabetically: (Descending)");
        for (Book book : bookRecord) {
            System.out.println("");
            book.displayBookInfo();
        }
    }
    //Sort By author
    public void bubbleSortByAuthor_Ascending(Book[] bookRecord){
    for(int i = 0; i < bookRecord.length - 1; i++){
            for(int j = 0; j < bookRecord.length - i - 1; j++){
                if(bookRecord[j].getAuthor().compareToIgnoreCase(bookRecord[j + 1].getAuthor()) > 0){
                    Book t = bookRecord[j];
                    bookRecord[j] = bookRecord[j + 1];
                    bookRecord[j + 1] = t;
                }
            }
        }
        printSortedByAuthorOfBooksIn_AscendingOrder(bookRecord);
    }
    public void bubbleSortByAuthor_Descending(Book[] bookRecord){
    for(int i = 0; i < bookRecord.length - 1; i++){
            for(int j = 0; j < bookRecord.length - i - 1; j++){
                if(bookRecord[j].getAuthor().compareToIgnoreCase(bookRecord[j + 1].getAuthor()) < 0){
                    Book t = bookRecord[j];
                    bookRecord[j] = bookRecord[j + 1];
                    bookRecord[j + 1] = t;
                }
            }
        }
        printSortedByAuthorOfBooksIn_DescendingOrder(bookRecord);
    }
    private void printSortedByAuthorOfBooksIn_AscendingOrder(Book[] bookRecord){
        System.out.println("List Of Books Sorted By Author Alpabetically: (Ascending)");
        for (Book book : bookRecord) {
            System.out.println("");
            book.displayBookInfo();
        }
    }
    private void printSortedByAuthorOfBooksIn_DescendingOrder(Book[] bookRecord){
        System.out.println("List Of Books Sorted By Author Alpabetically: (Descending)");
        for (Book book : bookRecord) {
            System.out.println("");
            book.displayBookInfo();
        }
    }
    //Sort by Publisher
    public void bubbleSortByPublisher_Ascending(Book[] bookRecord){
    for(int i = 0; i < bookRecord.length - 1; i++){
            for(int j = 0; j < bookRecord.length - i - 1; j++){
                if(bookRecord[j].getPublisher().compareToIgnoreCase(bookRecord[j + 1].getPublisher()) > 0){
                    Book t = bookRecord[j];
                    bookRecord[j] = bookRecord[j + 1];
                    bookRecord[j + 1] = t;
                }
            }
        }
        printSortedByPublisherOfBooksIn_AscendingOrder(bookRecord);
    }
    
    public void bubbleSortByPublisher_Descending(Book[] bookRecord){
    for(int i = 0; i < bookRecord.length - 1; i++){
            for(int j = 0; j < bookRecord.length - i - 1; j++){
                if(bookRecord[j].getTitle().compareToIgnoreCase(bookRecord[j + 1].getTitle()) < 0){
                    Book t = bookRecord[j];
                    bookRecord[j] = bookRecord[j + 1];
                    bookRecord[j + 1] = t;
                }
            }
        }
        printSortedByPublisherOfBooksIn_DescendingOrder(bookRecord);
    }
    private void printSortedByPublisherOfBooksIn_AscendingOrder(Book[] bookRecord){
        System.out.println("List Of Books Sorted By Publisher Alpabetically: (Ascending)");
        for (Book book : bookRecord) {
            System.out.println("");
            book.displayBookInfo();
        }
    }
    private void printSortedByPublisherOfBooksIn_DescendingOrder(Book[] bookRecord){
        System.out.println("List Of Books Sorted By Publisher Alpabetically: (Descending)");
        for (Book book : bookRecord) {
            System.out.println("");
            book.displayBookInfo();
        }
    }
    //Sort By ISBN
    public void bubbleSortByISBN_Ascending(Book[] bookRecord){
    for(int i = 0; i < bookRecord.length - 1; i++){
            for(int j = 0; j < bookRecord.length - i - 1; j++){
                if(bookRecord[j].getISBN().compareToIgnoreCase(bookRecord[j + 1].getISBN()) > 0){
                    Book t = bookRecord[j];
                    bookRecord[j] = bookRecord[j + 1];
                    bookRecord[j + 1] = t;
                }
            }
        }
        printSortedByISBNOfBooksIn_AscendingOrder(bookRecord);
    }
    
    public void bubbleSortByISBN_Descending(Book[] bookRecord){
    for(int i = 0; i < bookRecord.length - 1; i++){
            for(int j = 0; j < bookRecord.length - i - 1; j++){
                if(bookRecord[j].getISBN().compareToIgnoreCase(bookRecord[j + 1].getISBN()) < 0){
                    Book t = bookRecord[j];
                    bookRecord[j] = bookRecord[j + 1];
                    bookRecord[j + 1] = t;
                }
            }
        }
    printSortedByISBNOfBooksIn_DescendingOrder(bookRecord);
    }
    private void printSortedByISBNOfBooksIn_AscendingOrder(Book[] bookRecord){
        System.out.println("List Of Books Sorted By ISBN Alpabetically: (Ascending)");
        for (Book book : bookRecord) {
            System.out.println("");
            book.displayBookInfo();
        }
    }
    private void printSortedByISBNOfBooksIn_DescendingOrder(Book[] bookRecord){
        System.out.println("List Of Books Sorted By ISBN Alpabetically: (Descending)");
        for (Book book : bookRecord) {
            System.out.println("");
            book.displayBookInfo();
        }
    }
}
