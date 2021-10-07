package BSUIR.WT.Lab1.ClassesAndObjects;

import java.util.Comparator;

public class BookAuthorThenTitleThenPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return Comparator.comparing(Book::getAuthor)
                .thenComparing(Book::getTitle)
                .thenComparing(Book::getPrice)
                .compare(book1, book2);
    }
}
