package BSUIR.WT.Lab1.ClassesAndObjects;

import java.util.Objects;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String isbn) {
        super(title, author, price, isbn);
    }


    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        if (!equals(o)){
            return false;
        }
        ProgrammerBook programmerBook = (ProgrammerBook) o;
        return Objects.equals(programmerBook.language, language) && programmerBook.level == level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Language: %s;Level: %d;", language, level);
    }
}
