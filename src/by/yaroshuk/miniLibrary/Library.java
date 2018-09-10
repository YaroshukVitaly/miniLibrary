package by.yaroshuk.miniLibrary;

import java.util.Arrays;

public class Library {

    private Book[] books;
    private int current;
    private static long nextIndex = 1;

    public Library(int count) {
        books = new Book[count];
        current = 0;
    }
    public long add(String name, String author){
        Book book = new Book(name, author);
        book.setId(nextIndex++);
        books[current] = book;
        current++;
        return book.getId();
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
