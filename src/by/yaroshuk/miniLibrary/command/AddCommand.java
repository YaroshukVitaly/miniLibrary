package by.yaroshuk.miniLibrary.command;

public class AddCommand implements UserCommand {
    private String name;
    private String author;

    public AddCommand(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
