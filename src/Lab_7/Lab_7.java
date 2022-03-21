package Lab_7;

//Create a simple menu
//        1. Input book
//        2. Find book by ISBN
//        0. Exit!
//
//        Please override toString method to print out the found book.
//        If there is no matched book, please print out book not found

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_7 {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        boolean isContinuing = true;
        Scanner sc = new Scanner(System.in);

        while (isContinuing) {
            System.out.println("\n=====Menu=====\n" +
                    "1. Input book\n" +
                    "2. Find book by ISBN\n" +
                    "0. Exit !");

            System.out.print("Enter selection : ");
            int enterSelect = sc.nextInt();

            switch (enterSelect) {
                case 1:
                    System.out.print("Input ISBN: ");
                    String isbn = sc.next();
                    System.out.print("Input Title: ");
                    String title = sc.next();
                    System.out.print("Input Author Name: ");
                    String authorName = sc.next();
                    System.out.print("Input year: ");
                    int year = sc.nextInt();
                    Book newBook = new Book(isbn, title, authorName, year);
                    bookList.add(newBook);
                    break;
                case 2:
                    System.out.print("Input ISBN : ");
                    String isbnToFoFind = sc.next();
                    List<Book> ListBook  = findBookByISBN(isbnToFoFind, bookList);
                    if(ListBook.size() == 0){
                        System.out.printf("Don't have book with %s", isbnToFoFind);
                        break;
                    }
                    for(Book book: ListBook){
                        System.out.println(book);
                    }
                    break;
                case 0:
                    isContinuing = false;
                default:
                    System.out.println("See you again !");
            }
        }
    }
    private static List<Book> findBookByISBN(String ISBN, List<Book> bookList){
        List<Book> findListBook = new ArrayList<>();
        for(Book book : bookList){
            if(book.getISBN().equals(ISBN)){
                findListBook.add(book);
            }
        }
        return findListBook;
    }

}
