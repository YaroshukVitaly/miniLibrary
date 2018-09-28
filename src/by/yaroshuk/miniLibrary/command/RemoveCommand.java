package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Library;
import by.yaroshuk.miniLibrary.OutputPrinter;

public class RemoveCommand implements UserCommand {
    private long id;

    public RemoveCommand(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public void execute(Library library, OutputPrinter printer) {
        boolean delete = library.delete(id);
        if (delete){
            printer.println("Book " + id + " was successfully removed!");
        }else {
            printer.println("Book " + id + " was not found!");
        }
        printer.printSeparator();
    }

    @Override
    public String toString() {
        return "RemoveCommand{" +
                "id=" + id +
                '}';
    }
}
