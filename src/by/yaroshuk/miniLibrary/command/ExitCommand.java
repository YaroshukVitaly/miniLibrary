package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.LibraryBuisinessLogic;
import by.yaroshuk.miniLibrary.OutputPrinter;

public class ExitCommand implements UserCommand {

    @Override
    public void execute(LibraryBuisinessLogic logic, OutputPrinter printer) {
        printer.println("Exiting");
        System.exit(0);
    }
}
