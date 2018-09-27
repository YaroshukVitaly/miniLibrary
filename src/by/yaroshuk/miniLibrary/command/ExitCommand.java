package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Library;
import by.yaroshuk.miniLibrary.OutputPrinter;

public class ExitCommand implements UserCommand {

    @Override
    public void execute(Library library, OutputPrinter printer) {
        printer.println("Exiting");
        System.exit(0);
    }
}
