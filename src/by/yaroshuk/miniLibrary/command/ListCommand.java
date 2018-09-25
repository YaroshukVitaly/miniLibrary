package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Book;
import by.yaroshuk.miniLibrary.Library;

public class ListCommand implements UserCommand {

    @Override
    public void execute(Library library) {
        System.out.println("List of books: ");
        for (Book book : library.list()){
            System.out.println(book);
        }

    }
}
