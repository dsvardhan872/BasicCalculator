    package com.dsv.assignment6.app;

    import com.dsv.assignment6.model.LibraryData;

    import java.lang.reflect.Array;
    import java.util.ArrayList;
    import java.util.Scanner;

    //6.Build a Java application to handle library operations.
    // Include functions like adding books, checking out books,
    // returning books, and displaying available books.
    public class LibraryManagement {
        private void addBooks(Scanner read, LibraryData lib){
            System.out.print("Enter the name of the book");
            String bookName = read.nextLine();
            ArrayList<String> books = lib.getBookNames();
            if(books == null){
                books = new ArrayList<>();
            }

            books.add(bookName);
            lib.setBookNames(books);
            System.out.println("Book added successfully");

        }
        private void checkoutBooks(LibraryData libInfo, LibraryManagement libManage, Scanner read){
            //display the available books
            libManage.displayBooks(libInfo);

            System.out.print("Select the book you want:");
            String selectBook = read.nextLine();

            //checking book is present or not
            ArrayList<String> availableBooks = libInfo.getBookNames();
            if(availableBooks == null || !availableBooks.contains(selectBook)){
                System.out.println(selectBook+" is not available in the libray");
                return;
            }
            availableBooks.remove(selectBook);

            System.out.print("Date: ");
            String date = read.nextLine();

            System.out.print("Book serial no: ");
            int sNo = read.nextInt();

            ArrayList<String> checkOutDet = libInfo.getBookCheckout();
            if(checkOutDet == null){
                checkOutDet = new ArrayList<>();
            }
            checkOutDet.add("Book: "+ selectBook+", date: "+date+", sNo:"+sNo+"\n");

            libInfo.setBookCheckout(checkOutDet);
            System.out.println(selectBook+" is checkout successfully");
        }
        private void returnBooks(LibraryData libInfo, Scanner read){
            ArrayList<String> checkoutBooks = libInfo.getBookCheckout();
            System.out.println("The checkout books are"+checkoutBooks);
            if(checkoutBooks == null){
                return;
            }
            //checking if book is already returned
            System.out.print("Enter the serial no: ");
            int sNo = read.nextInt();
            read.nextLine();
            if(checkoutBooks.contains(sNo)){
                System.out.println("Book is already returned");
                return;
            }

            //verifying the details
            System.out.println(checkoutBooks.get(sNo));
            checkoutBooks.remove(sNo);

            //adding return details
            System.out.print("Enter the returned book serial no:");
            int sNo1 = read.nextInt();

            System.out.print("Enter the book name");
            String book = read.nextLine();

            System.out.print("Enter the return date");
            String retDate = read.nextLine();

            ArrayList<String> returnBooks = libInfo.getBookReturn();
            if (returnBooks == null) {
                returnBooks = new ArrayList<>();
            }
            returnBooks.add("sNo:"+sNo1+", bookName:"+book+", returnDate:"+retDate);
            libInfo.setBookReturn(returnBooks);
            System.out.println("Book returned successfully");
        }
        private void displayBooks(LibraryData libInfo){
            System.out.println(libInfo.getBookNames());
        }

        public static void main(String[] args) {
            //Object creation
            Scanner read = new Scanner(System.in);
            LibraryData lib = new LibraryData();
            LibraryManagement libManage = new LibraryManagement();
            boolean flag = true;

            while(flag){
                System.out.println("1. Add Books in the library");
                System.out.println("2. Give Books ");
                System.out.println("3. return books");
                System.out.println("4. Display the available books");
                System.out.println("Choose your option");
                int option = read.nextInt();
                read.nextLine();
                switch (option){
                    case 1: libManage.addBooks(read,lib);
                        break;
                    case 2: libManage.checkoutBooks(lib,libManage,read);
                        break;
                    case 3: libManage.returnBooks(lib,read);
                        break;
                    case 4: libManage.displayBooks(lib);
                        break;
                    default:
                        System.out.println("Restart the application to try again");
                }
                if(option>4){
                    flag = false;
                }
            }
        }
    }
