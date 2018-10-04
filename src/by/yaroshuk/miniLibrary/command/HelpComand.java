package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.LibraryBuisinessLogic;
import by.yaroshuk.miniLibrary.OutputPrinter;

public class HelpComand implements UserCommand {
    @Override
    public void execute(LibraryBuisinessLogic logic, OutputPrinter printer) {
        printer.println("You can use following command: ");
        printer.printHelp();
    }
}
