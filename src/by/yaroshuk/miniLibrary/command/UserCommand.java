package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.LibraryBuisinessLogic;
import by.yaroshuk.miniLibrary.OutputPrinter;

public interface UserCommand {
    void execute(LibraryBuisinessLogic logic, OutputPrinter printer);
}
