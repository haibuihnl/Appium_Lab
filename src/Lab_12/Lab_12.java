package Lab_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_12 {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book(27,2011,"De men phuu luu ky","To Hoai");
        Book book2 = new Book(15,2006,"Lang","Kim Lan");
        Book book3 = new Book(34,1999,"Chiec luoc nga","Nguyen Quang Sang");
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        System.out.println("----------------List before sort ------------------");
        printSortedBooks(bookList);
        initSort(EnumBook.SORTBYISBN,bookList);
        initSort(EnumBook.SORTBYYEAR,bookList);

    }
    private static void printSortedBooks(List<Book> bookList){
        for(Book book:bookList){
            System.out.println(book);
        }
    }
    private static void initSort(EnumBook enumBook,List<Book> bookList){
        switch (enumBook){
            case SORTBYISBN:
                System.out.println("---------------List after sort ISBN---------------");
                Collections.sort(bookList);
                printSortedBooks(bookList);
                break;
            case SORTBYYEAR:
                System.out.println("---------------List after sort Year---------------");
                Collections.sort(bookList, new BookAgeComparator());
                printSortedBooks(bookList);
                break;
        }
    }
}
