package BSUIR.WT.Lab1;

import BSUIR.WT.Lab1.ClassesAndObjects.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.AddBall(new Ball(5.2d, Color.blue));
        basket.AddBall(new Ball(1.4d, Color.orange));
        basket.AddBall(new Ball(3.0d, Color.yellow));
        basket.AddBall(new Ball(7.2d, Color.red));
        basket.AddBall(new Ball(3.0d, Color.black));
        basket.AddBall(new Ball(7.2d, Color.blue));
        basket.AddBall(new Ball(3.0d, Color.red));
        basket.AddBall(new Ball(7.2d, Color.blue));

        System.out.printf("Count of blue balls in basket: %d\n", basket.getCountOfColor(Color.blue));
        System.out.printf("Total weight of balls in basket: %f\n", basket.getTotalWeight());


        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Title #1", "Jhon Stone", 17, "978-3-16-148410-0"));
        books.add(new Book("Summer", "Mike Tree", 13,"1-56619-909-3"));
        books.add(new Book("Hollywood", "Albert River", 7, "978-1-56619-909-4"));
        books.add(new Book("Hope #2", "Jhon Stone", 12, "978-3-16-140419-0"));
        books.add(new Book("Like a paper", "Carlos Lake", 11, "1-4028-9462-7"));
        books.add(new Book("Blessing #3", "Jhon Stone", 16, "1-76919-119-3"));
        books.add(new Book("Blessing #3", "Jhon Stone", 19, "1-76919-119-3"));
        books.add(new Book("Death #4", "Jhon Stone", 5, "978-3-16-148410-0"));
        books.add(new Book("Blue Butterfly", "Chloe Price", 9, "978-1-4028-9462-6"));
        Collections.sort(books);

        books.sort(new BookTitleComparator());
        books.sort(new BookAuthorThenTitleComparator());
        books.sort(new BookTitleThenAuthorComparator());
        books.sort(new BookAuthorThenTitleThenPriceComparator());
    }
}
