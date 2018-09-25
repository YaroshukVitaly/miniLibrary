package by.yaroshuk.miniLibrary;


import by.yaroshuk.miniLibrary.command.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Library library = new Library();
        UserConsoleInpunReader consoleInpunReader = new UserConsoleInpunReader(printer);
        while (true) {
            UserCommand userCommand = consoleInpunReader.nextCommand();
            if (userCommand == null){
                printer.println("Unknown command!");
            }else {
                execute(userCommand, library, consoleInpunReader);
            }
        }
    }

    private static void execute(UserCommand userCommand, Library library, UserConsoleInpunReader consoleInpunReader){
       userCommand.execute(library);
    }


}

