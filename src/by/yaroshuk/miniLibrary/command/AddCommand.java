package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Library;

public class AddCommand implements UserCommand {
    private String name;
    private String author;

    public AddCommand(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void execute(Library library) {
        library.add(name, author);

    }
}
