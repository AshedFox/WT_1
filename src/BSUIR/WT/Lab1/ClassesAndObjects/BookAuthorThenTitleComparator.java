package BSUIR.WT.Lab1.ClassesAndObjects;

import java.util.Comparator;

public class BookAuthorThenTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return Comparator.comparing(Book::getAuthor).thenComparing(Book::getTitle).compare(book1, book2);
    }
}
