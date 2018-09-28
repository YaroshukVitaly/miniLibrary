package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Book;
import by.yaroshuk.miniLibrary.Library;
import by.yaroshuk.miniLibrary.OutputPrinter;

public class ListCommand implements UserCommand {

    @Override
    public void execute(Library library, OutputPrinter printer) {
        printer.println("List of books: ");
        for (Book book : library.list()){
            printer.println(book + "");
        }
        printer.printSeparator();
    }
}
