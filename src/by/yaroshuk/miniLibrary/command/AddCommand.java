package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.LibraryBuisinessLogic;
import by.yaroshuk.miniLibrary.OutputPrinter;

public class AddCommand implements UserCommand {
    private String name;
    private String author;

    public AddCommand(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void execute(LibraryBuisinessLogic logic, OutputPrinter printer) {
       long id = logic.add(name, author);
       printer.println();
       printer.println("Added book: ");
       printer.print(logic.search(id));
       printer.printSeparator();

    }

    @Override
    public String toString() {
        return "AddCommand{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
