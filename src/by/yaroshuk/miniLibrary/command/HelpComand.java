package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Library;

public class HelpComand implements UserCommand {
    @Override
    public void execute(Library library) {
        printer.println("You can use following command: ");
        printer.println("add");
        printer.println("send");
        printer.println("list");
        printer.println("remove <<id>>");
        printer.println("help");
        printer.println("exit");
    }
}
