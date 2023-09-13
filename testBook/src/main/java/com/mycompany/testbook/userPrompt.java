package com.mycompany.testbook;

import java.util.Arrays;
import java.util.Scanner;

public class userPrompt {
    private Book[] bookRecord;
    private Scanner scanner;

    public userPrompt(Book[] bookRecord, Scanner scanner) {
        this.bookRecord = bookRecord;
        this.scanner = scanner;
    }

    public void startOfBookProgram() {
        System.out.println("Welcome!");
        System.out.println("Note: The program is still in beta testing. There may be some bugs or errors.");

        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Search for Books           |     (Type 'Search') "
                            +"\n2. See the list of Books      |     (Type 'see list')" 
                            +"\n3. Edit a Book                |     (Type 'edit')"  
                            +"\n4. Add a Book                 |     (Type 'add')"
                            +"\n5. Delete a Book              |     (Type 'delete')"
                            +"\n6. Exit                       |     (Type 'exit')");
            System.out.print("Enter your choice: ");

            String userChoice = scanner.nextLine();
                if(userChoice.equalsIgnoreCase("search")){searchForBooks();}
                if(userChoice.equalsIgnoreCase("see list")){seeListOfBooks();}
                if(userChoice.equalsIgnoreCase("edit")){editABook();}
                if(userChoice.equalsIgnoreCase("add")){addABook();}
                if(userChoice.equalsIgnoreCase("delete")){deleteABook();}
                if(userChoice.equalsIgnoreCase("exit")){                
                    System.out.println("Exiting the program.");
                    return;
                }
                //else{System.out.println("Invalid choice. Please choose a valid option.");}
        }
    }

    private Book searchForBooks() {
        bookSearch bookSearch = new bookSearch();
        System.out.println("\nChoose how you want to search:");
        System.out.println("1. Search by title");
        System.out.println("2. Search by author");
        System.out.println("3. Search by publisher");
        System.out.println("4. Search by ISBN");
        System.out.print("Enter your choice: ");
        int searchChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Book searchedBook = null;

        switch (searchChoice) {
            case 1:
                searchedBook = bookSearch.byTitle(bookRecord);
                break;
            case 2:
                searchedBook = bookSearch.byAuthor(bookRecord);
                break;
            case 3:
                searchedBook = bookSearch.byPublisher(bookRecord);
                break;
            case 4:
                searchedBook = bookSearch.byISBN(bookRecord);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        if (searchedBook != null) {
            System.out.println("Book found:");
            searchedBook.displayBookInfo();
        } else {
            System.out.println("Book not found.");
        }
        return searchedBook;
    }

    private void seeListOfBooks() {
        bookSort bookSort = new bookSort();
        System.out.println("\nChoose how you want to sort:");
        String[] prompt = {"1. Sort by title", "2. Sort by author", "3. Sort by publisher", "4. Sort by ISBN"};
        for(String elements : prompt) System.out.println(elements);
        
        System.out.print("Enter your choice: ");
        int sortChoice = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("\nChoose the sorting order: \n1. Ascending \n2. Descending");
        System.out.print("Enter your choice: ");
        String sortOrder = scanner.nextLine();

        switch (sortChoice) {
            case 1:
                if (sortOrder.equalsIgnoreCase("Ascending")) {
                    bookSort.bubbleSortByTitle_Ascending(bookRecord);
                } else if (sortOrder.equalsIgnoreCase("Descending")) {
                    bookSort.bubbleSortByTitle_Descending(bookRecord);
                } else {
                    System.out.println("Invalid sorting order.");
                }
                break;
            case 2:
                if (sortOrder.equalsIgnoreCase("Ascending")) {
                    bookSort.bubbleSortByAuthor_Ascending(bookRecord);
                } else if (sortOrder.equalsIgnoreCase("Descending")) {
                    bookSort.bubbleSortByAuthor_Descending(bookRecord);
                } else {
                    System.out.println("Invalid sorting order.");
                }
                break;
            case 3:
                if (sortOrder.equalsIgnoreCase("Ascending")) {
                    bookSort.bubbleSortByPublisher_Ascending(bookRecord);
                } else if (sortOrder.equalsIgnoreCase("Descending")) {
                    bookSort.bubbleSortByPublisher_Descending(bookRecord);
                } else {
                    System.out.println("Invalid sorting order.");
                }
                break;
            case 4:
                if (sortOrder.equalsIgnoreCase("Ascending")) {
                    bookSort.bubbleSortByISBN_Ascending(bookRecord);
                } else if (sortOrder.equalsIgnoreCase("Descending")) {
                    bookSort.bubbleSortByISBN_Descending(bookRecord);
                } else {
                    System.out.println("Invalid sorting order.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
    public void editABook(){
        Book theBookIFound  = searchForBooks();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title to Search for: ");
        String whichToEdit = sc.nextLine();
        int index = 0;
        
        if(whichToEdit.equalsIgnoreCase(theBookIFound.getTitle())){
            System.out.println("Which do you want to edit: " + 
                               "\n1. Title       | Type 'Title'" + 
                               "\n1. Author      | Type 'Author'" + 
                               "\n1. Publisher   | Type 'Publisher'" + 
                               "\n1. ISBN        | Type 'ISBN'"  
                               );
            String userChoice = sc.nextLine();
            if(userChoice.equalsIgnoreCase("Title")){
                String newTitle = sc.nextLine();
                System.out.print("Enter the new Titel: ");
                theBookIFound.setTitle(newTitle);
            }
            else if(userChoice.equalsIgnoreCase("Author")){
                String newAuthor = sc.nextLine();
                System.out.print("Enter the new Author: ");
                theBookIFound.setTitle(newAuthor);
            }
            else if(userChoice.equalsIgnoreCase("Publisher")){
                String newPublisher = sc.nextLine();
                System.out.print("Enter the new Publisher: ");
                theBookIFound.setTitle(newPublisher);
            }
            else if(userChoice.equalsIgnoreCase("ISBN")){
                String newISBN = sc.nextLine();
                System.out.print("Enter the new ISBN: ");
                theBookIFound.setISBN(newISBN);
            }
        }
    }
    public void addABook() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the title: ");
    String title = sc.nextLine();
    System.out.print("Enter the author: ");
    String author = sc.nextLine();
    System.out.print("Enter the publisher: ");
    String publisher = sc.nextLine();
    System.out.print("Enter the ISBN: ");
    String isbn = sc.nextLine();

        boolean added = false;
        for (int i = 0; i < bookRecord.length; i++) {
            if (bookRecord[i].getTitle().equalsIgnoreCase("EMPTY SLOT. (PLEASE ADD A BOOK)")) {
                bookRecord[i] = new Book(new String[]{title, author, publisher, isbn});
                added = true;
                System.out.println("Book added successfully!");
                break;
            }
        }

        if (!added) {
            System.out.println("The library is full. Cannot add more books.");
        }
    }

    public void deleteABook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the title or ISBN of the book to delete: ");
        String searchTerm = sc.nextLine();

        boolean found = false;
        String[] emptyInfo = {"EMPTY SLOT. (PLEASE ADD A BOOK)", 
                              "EMPTY SLOT. (PLEASE ADD A BOOK)", 
                              "EMPTY SLOT. (PLEASE ADD A BOOK)", 
                              "EMPTY SLOT. (PLEASE ADD A BOOK)"};
        for (int i = 0; i < bookRecord.length; i++) {
            if (bookRecord[i] != null && (bookRecord[i].getTitle().equalsIgnoreCase(searchTerm)
                    || bookRecord[i].getISBN().equalsIgnoreCase(searchTerm))) {
                bookRecord[i] = new Book(emptyInfo);
                found = true;
                System.out.println("Book deleted successfully!");
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found in the library.");
        }
    }
}
/*
        Delete algo 

        int[] n = {1, 0, 0, 4, 3, 5, 0, 0, 6};
        
        System.out.println("Elemetns: ");
        for(int e : n)System.out.print(e + " ");
        
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length - 1; j++) {
                if(n[j] == 0){
                    int t = n[j]; n[j] = n[j+1]; n[j+1] = t;
                }
            }
        }
        System.out.print("\nElemetns: ");
        for(int e : n)System.out.print(e + " ");
        
        //count zeroes
        int zeroCounter = 0;
        for(int i = 0; i < n.length; i++){
            if(n[i] == 0){zeroCounter++;}
        }
        System.out.print("\nLessened array: ");
        for(int i = 0; i < n.length - zeroCounter; i++){
            System.out.print(n[i] + " ");
*/