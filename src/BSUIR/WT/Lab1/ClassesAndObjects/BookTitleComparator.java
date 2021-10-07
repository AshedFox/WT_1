package BSUIR.WT.Lab1.ClassesAndObjects;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return Comparator.comparing(Book::getTitle).compare(book1, book2);
    }
}
