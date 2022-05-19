package Lab_12;

public class Book implements Comparable<Book> {
    private int ISBN;
    private int year;
    private String title;
    private String author;

    public Book() {
    }

    public Book(int ISBN, int year, String title, String author) {
        this.ISBN = ISBN;
        this.year = year;
        this.title = title;
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", year=" + year +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        return this.ISBN - book.ISBN;
    }
}
