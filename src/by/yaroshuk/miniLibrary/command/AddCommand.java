package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Library;
import by.yaroshuk.miniLibrary.OutputPrinter;

public class AddCommand implements UserCommand {
    private String name;
    private String author;

    public AddCommand(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void execute(Library library, OutputPrinter printer) {
       long id = library.add(name, author);
       printer.print("Added book: id = " + id);
       printer.printSeparator();

    }
}
