package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Book;
import by.yaroshuk.miniLibrary.LibraryBuisinessLogic;
import by.yaroshuk.miniLibrary.OutputPrinter;

public class ListCommand implements UserCommand {

    @Override
    public void execute(LibraryBuisinessLogic logic, OutputPrinter printer) {
        printer.println();
        printer.println("List of books: ");
        for (Book book : logic.list()){
            printer.print(book);
            printer.printSmallSeparator();
        }
        printer.printSeparator();
    }
}
