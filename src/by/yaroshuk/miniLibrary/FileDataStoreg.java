package by.yaroshuk.miniLibrary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileDataStoreg {

    public static final String DELIMITER = "\t";
    private String fileName;

    public FileDataStoreg(String fileName) {
        this.fileName = fileName;
    }

    public void save(List<Book> books){
        try (PrintWriter writer = new PrintWriter(Paths.get(fileName).toFile())){
            for (Book book : books){
                writer.print(book.getId());
                writer.print(DELIMITER);
                writer.print(book.getName());
                writer.print(DELIMITER);
                writer.print(book.getAuthor());
                writer.print(DELIMITER);
                writer.println();
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found!");
        }
    }

    public List<Book> read(){
        List<Book> books = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            for (String line : lines){
                String[] tokens = line.split(DELIMITER);
                long id = Long.parseLong(tokens[0]);
                books.add(new Book(id, tokens[1], tokens [2]));
            }

        } catch (IOException e) {
            System.out.println("Error read file!");
        }
        return books;
    }
}
