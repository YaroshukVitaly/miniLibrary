package by.yaroshuk.miniLibrary;


import by.yaroshuk.miniLibrary.command.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main {

    private static final Logger commandLogg = LoggerFactory.getLogger("CommandLogg");

    public static void main(String[] args) throws IOException {

        Library library = new Library();
        OutputPrinter printer = new OutputPrinter(System.out);
        UserConsoleInpunReader consoleInpunReader = new UserConsoleInpunReader(printer);
        while (true) {
            printer.printUserPrompt();
            UserCommand userCommand = consoleInpunReader.nextCommand();
            if (userCommand == null){
                printer.println("Unknown command!");
            }else {
                commandLogg.debug(userCommand.toString());
                execute(userCommand, library, consoleInpunReader, printer);
            }
        }
    }

    private static void execute(UserCommand userCommand, Library library, UserConsoleInpunReader consoleInpunReader, OutputPrinter printer){
       userCommand.execute(library, printer);
    }


}

