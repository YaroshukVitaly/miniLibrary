package by.yaroshuk.miniLibrary;


import by.yaroshuk.miniLibrary.command.*;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Library library = new Library();
        UserConsoleInpunReader consoleInpunReader = new UserConsoleInpunReader();
        while (true) {
            UserCommand userCommand = consoleInpunReader.nextCommand();
            if (userCommand == null){
                System.out.println("Unknown command!");
            }else {
                execute(userCommand, library, consoleInpunReader);
            }
        }
    }

    private static void execute(UserCommand userCommand, Library library, UserConsoleInpunReader consoleInpunReader){
        if (userCommand instanceof AddCommand){
            executeAdd((AddCommand)userCommand, library);
        }
        if (userCommand instanceof RemoveCommand){
            executeRemove((RemoveCommand)userCommand, library);
        }
        if (userCommand instanceof ExitCommand){
            executeExit((ExitCommand)userCommand, library);
        }
        if (userCommand instanceof HelpComand){
            executeHelp((HelpComand)userCommand, library);
        }
        if (userCommand instanceof SendCommand){
            executeSend((SendCommand)userCommand, library);
        }
        if (userCommand instanceof ListCommand){
            executeList((ListCommand)userCommand, library);
        }


    }

    private static void executeList(ListCommand userCommand, Library library) {
        System.out.println("List of books: ");
        for (Book book : library.list()){
            System.out.println(book);
        }

    }

    private static void executeSend(SendCommand userCommand, Library library) {
        List<Long> longs = library.sendOnSave();
        System.out.println("Following book were sent:" + longs);

    }

    private static void executeHelp(HelpComand userCommand, Library library) {
        System.out.println("You can use following command: ");
        System.out.println("add");
        System.out.println("send");
        System.out.println("list");
        System.out.println("remove <<id>>");
        System.out.println("help");
        System.out.println("exit");
    }

    private static void executeExit(ExitCommand userCommand, Library library) {
        System.out.println("Exiting");
        System.exit(0);
    }

    private static void executeRemove(RemoveCommand userCommand, Library library) {
        boolean delete = library.delete(userCommand.getId());
        if (delete){
            System.out.println("Book " + userCommand.getId() + " was successfully removed!");
        }else {
            System.out.println("Book " + userCommand.getId() + " was not found!");
        }
    }

    private static void executeAdd(AddCommand userCommand, Library library) {
        library.add(userCommand.getName(), userCommand.getAuthor());

    }


    //  Entry entry = new Entry();
        //   entry.write();
        //  Reading reading = new Reading();
        //    reading.red();

}

