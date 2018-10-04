package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.LibraryBuisinessLogic;
import by.yaroshuk.miniLibrary.OutputPrinter;

public class EmptyCommand implements UserCommand {
    @Override
    public void execute(LibraryBuisinessLogic logic, OutputPrinter printer) {

    }
}
