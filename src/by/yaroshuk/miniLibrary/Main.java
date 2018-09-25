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
       userCommand.execute(library);
    }

    //  Entry entry = new Entry();
        //   entry.write();
        //  Reading reading = new Reading();
        //    reading.red();

}

