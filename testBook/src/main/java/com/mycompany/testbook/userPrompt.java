package com.mycompany.testbook;

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
            System.out.println("1. Search for Books");
            System.out.println("2. See the list of Books");
            System.out.println("3. Edit a Book");
            System.out.println("4. Add a Book");
            System.out.println("5. Delete a Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int userChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (userChoice) {
                case 1:
                    searchForBooks();
                    break;
                case 2:
                    seeListOfBooks();
                    break;
                case 3:
                    editABook();
                    break;
                case 4:
                    addABook();
                    break;
                case 5:
                    deleteABook();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    private void searchForBooks() {
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

    private void editABook() {
        System.out.print("Enter book title or ISBN to edit: ");
        String searchTerm = scanner.nextLine();

        int indexToEdit = -1;

        for (int i = 0; i < bookRecord.length; i++) {
            if (bookRecord[i].getTitle().equalsIgnoreCase(searchTerm) || bookRecord[i].getISBN().equalsIgnoreCase(searchTerm)) {
                indexToEdit = i;
                break;
            }
        }

        if (indexToEdit >= 0) {
            Book bookToEdit = bookRecord[indexToEdit];
            System.out.println("Editing book:");
            bookToEdit.displayBookInfo();

            System.out.println("Select an attribute to edit:");
            System.out.println("1. Title");
            System.out.println("2. Author");
            System.out.println("3. Publisher");
            System.out.println("4. ISBN");
            System.out.println("5. Cancel");
            System.out.print("Enter your choice: ");
            int editChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (editChoice) {
                case 1:
                    System.out.print("Enter new title: ");
                    String newTitle = scanner.nextLine();
                    bookToEdit.setTitle(newTitle);
                    break;
                case 2:
                    System.out.print("Enter new author: ");
                    String newAuthor = scanner.nextLine();
                    bookToEdit.setAuthor(newAuthor);
                    break;
                case 3:
                    System.out.print("Enter new publisher: ");
                    String newPublisher = scanner.nextLine();
                    bookToEdit.setPublisher(newPublisher);
                    break;
                case 4:
                    System.out.print("Enter new ISBN: ");
                    String newISBN = scanner.nextLine();
                    bookToEdit.setISBN(newISBN);
                    break;
                case 5:
                    System.out.println("Edit canceled.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println("Book edited successfully.");
            System.out.println("Updated book information:");
            bookToEdit.displayBookInfo();
        } else {
            System.out.println("Book not found.");
        }
    }

    private void addABook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();

        Book newBook = new Book(new String[]{title, author, publisher, isbn});

        // Extend the bookRecord array to accommodate the new book
        Book[] newBookRecord = new Book[bookRecord.length + 1];
        System.arraycopy(bookRecord, 0, newBookRecord, 0, bookRecord.length);
        newBookRecord[bookRecord.length] = newBook;
        bookRecord = newBookRecord;

        System.out.println("Book added successfully.");
    }

    private void deleteABook() {
        System.out.print("Enter book title or ISBN to delete: ");
        String searchTerm = scanner.nextLine();

        int indexToDelete = -1;

        for (int i = 0; i < bookRecord.length; i++) {
            if (bookRecord[i].getTitle().equalsIgnoreCase(searchTerm) || bookRecord[i].getISBN().equalsIgnoreCase(searchTerm)) {
                indexToDelete = i;
                break;
            }
        }

        if (indexToDelete >= 0) {
            // Create a new array without the deleted book
            Book[] newBookRecord = new Book[bookRecord.length - 1];
            System.arraycopy(bookRecord, 0, newBookRecord, 0, indexToDelete);
            System.arraycopy(bookRecord, indexToDelete + 1, newBookRecord, indexToDelete, bookRecord.length - indexToDelete - 1);
            bookRecord = newBookRecord;

            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }
}
