package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Library;
import by.yaroshuk.miniLibrary.OutputPrinter;
import by.yaroshuk.miniLibrary.UserCommandLineCommand;

public class HelpComand implements UserCommand {
    @Override
    public void execute(Library library, OutputPrinter printer) {
        printer.println("You can use following command: ");
        printer.printHelp();
    }
}
