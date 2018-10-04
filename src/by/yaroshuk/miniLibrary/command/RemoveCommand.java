package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.LibraryBuisinessLogic;
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
    public void execute(LibraryBuisinessLogic logic, OutputPrinter printer) {
        boolean delete = logic.delete(id);
        printer.println();
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
