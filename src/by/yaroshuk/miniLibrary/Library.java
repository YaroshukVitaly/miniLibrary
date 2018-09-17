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
    public Book search(long id){
        for (Book book : books){
            if (book.getId() == id){
                return book;
            }
        }
        return null;
    }

    public boolean delete (long id){
        Book book = search(id);
        return books.remove(book);
    }
    public List<Long> sendOnSave(){
        List<Book> toRemove = new ArrayList<>();
        for (Book book : books) {
            boolean accepted = save.queue(book);
            if (accepted){
                toRemove.add(book);
            }
        }
        List<Long> ids = new ArrayList<>();
        for (Book book : toRemove){
            ids.add(book.getId());
            books.remove(book);
        }
        return ids;
    }


    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }

}
