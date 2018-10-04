package by.yaroshuk.miniLibrary;

import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> books;
    private static long nextIndex = 1;

    public Library (){
        this (100);
    }

    public Library(int count) {
       this (count, new ArrayList<>());
    }

    public Library(int count, List<Book> books){
        this.books = new ArrayList<>(count);
        this.books.addAll(books);

        for (Book existingBook : books){
            nextIndex = Math.max(nextIndex, existingBook.getId() + 1);
        }

//        nextIndex = existingBooks.stream().map(Book::getId).max(Long::compare).orElseGet(() -> 1L) + 1;
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

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }


}
