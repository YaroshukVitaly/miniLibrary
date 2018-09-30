package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Library;
import by.yaroshuk.miniLibrary.OutputPrinter;

import java.util.List;

public class SendCommand implements UserCommand {

    @Override
    public void execute(Library library, OutputPrinter printer) {
        List<Long> longs = library.sendOnSave();
        printer.println();
        printer.println("Following book were sent:");
        for (Long id : longs){
            printer.printAlign( "Id", id);
        }
        printer.printSeparator();
    }

    @Override
    public String toString() {
        return "SendCommand";
    }
}
