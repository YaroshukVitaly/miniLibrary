package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Book;
import by.yaroshuk.miniLibrary.Library;

public class ListCommand implements UserCommand {

    @Override
    public void execute(Library library) {
        printer.println("List of books: ");
        for (Book book : library.list()){
            printer.println(book);
        }

    }
}
