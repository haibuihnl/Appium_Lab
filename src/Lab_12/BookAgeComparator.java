package Lab_12;

import java.util.Comparator;

public class BookAgeComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getYear() - book2.getYear();
    }
}
