package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Library;
import by.yaroshuk.miniLibrary.OutputPrinter;

public interface UserCommand {
    void execute(Library library, OutputPrinter printer);
}
