package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Library;
import by.yaroshuk.miniLibrary.OutputPrinter;

public class EmptyCommand implements UserCommand {
    @Override
    public void execute(Library library, OutputPrinter printer) {

    }
}
