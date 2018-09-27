package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Library;
import by.yaroshuk.miniLibrary.OutputPrinter;

import java.util.List;

public class SendCommand implements UserCommand {

    @Override
    public void execute(Library library, OutputPrinter printer) {
        List<Long> longs = library.sendOnSave();
        printer.println("Following book were sent:" + longs);
        printer.printSeparator();
    }
}
