package by.yaroshuk.miniLibrary;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private Save save;
    private List<Book> books;
    private static long nextIndex = 1;

    public Library (){
        this (100);
    }

    public Library(int count) {
        books = new ArrayList<>(count);
        save = new Save();
    }
    public long add(String name, String author){
        Book book = new Book(name, author);
        book.setId(nextIndex++);
        books.add(book);
        return book.getId();
    }

    public List<Book> list(){
        return new ArrayList<>(books);
    }


    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
