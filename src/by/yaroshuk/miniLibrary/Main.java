package by.yaroshuk.miniLibrary;


import by.yaroshuk.miniLibrary.command.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        LibraryBuisinessLogic logic = new LibraryBuisinessLogic();
        OutputPrinter printer = new OutputPrinter(System.out);
        UserConsoleInpunReader consoleInpunReader = new UserConsoleInpunReader(printer);
        printer.println("Используйте следущие команды: ");
        printer.printHelp();
        while (true) {
            printer.printUserPrompt();
            UserCommand userCommand = consoleInpunReader.nextCommand();
            if (userCommand == null){
                printer.println("Unknown command!");
            }else {
                execute(userCommand, logic, consoleInpunReader, printer);
            }
        }
    }

    private static void execute(UserCommand userCommand, LibraryBuisinessLogic logic, UserConsoleInpunReader consoleInpunReader, OutputPrinter printer){
       userCommand.execute(logic, printer);
    }


}

