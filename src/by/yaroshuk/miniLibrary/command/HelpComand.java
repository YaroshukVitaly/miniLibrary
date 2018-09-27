package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Library;
import by.yaroshuk.miniLibrary.OutputPrinter;

public class HelpComand implements UserCommand {
    @Override
    public void execute(Library library, OutputPrinter printer) {
        printer.println("You can use following command: ");
        printer.println("add");
        printer.println("send");
        printer.println("list");
        printer.println("remove <<id>>");
        printer.println("help");
        printer.println("exit");
        printer.printSeparator();
    }
}
