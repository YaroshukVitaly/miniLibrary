package by.yaroshuk.miniLibrary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
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
        List<Book> existingBooks = read();
        books.addAll(existingBooks);

        for (Book existingBook : existingBooks){
            nextIndex = Math.max(nextIndex, existingBook.getId() + 1);
        }

//        nextIndex = existingBooks.stream().map(Book::getId).max(Long::compare).orElseGet(() -> 1L) + 1;
    }
    public long add(String name, String author){
        Book book = new Book(name, author);
        book.setId(nextIndex++);
        books.add(book);
        save();
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
        save();
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
        save();
        return ids;
    }


    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }

    public void save(){
        try (PrintWriter writer = new PrintWriter(Paths.get("books.txt").toFile())){
            for (Book book : books){
                writer.print(book.getId());
                writer.print("\t");
                writer.print(book.getName());
                writer.print("\t");
                writer.print(book.getAuthor());
                writer.print("\t");
                writer.println();
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found!");
        }
    }

    public List<Book> read(){
        try {
            List<Book> books = new ArrayList<>();
            List<String> lines = Files.readAllLines(Paths.get("books.txt"));
            for (String line : lines){
                String[] tokens = line.split("\t");
                long id = Long.parseLong(tokens[0]);
                books.add(new Book(id, tokens[1], tokens [2]));
            }

        } catch (IOException e) {
            System.out.println("Error read file!");
        }
        return books;
    }

}
