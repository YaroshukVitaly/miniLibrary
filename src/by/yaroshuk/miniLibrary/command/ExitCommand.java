package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Library;

public class ExitCommand implements UserCommand {

    @Override
    public void execute(Library library) {
        printer.println("Exiting");
        System.exit(0);
    }
}
