package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Library;

public class RemoveCommand implements UserCommand {
    private long id;

    public RemoveCommand(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public void execute(Library library) {
        boolean delete = library.delete(id);
        if (delete){
            printer.println("Book " + id + " was successfully removed!");
        }else {
            printer.println("Book " + id + " was not found!");
        }
    }
}
