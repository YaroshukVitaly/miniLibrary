package by.yaroshuk.miniLibrary;

import by.yaroshuk.miniLibrary.command.*;

import java.util.Scanner;

public class UserConsoleInpunReader {
    private Scanner scanner;
    private OutputPrinter printer;

    public UserConsoleInpunReader(OutputPrinter printer) {
        this.printer = printer;
        scanner = new Scanner(System.in);
    }

    public UserCommand nextCommand(){
            Scanner s = new Scanner(scanner.nextLine());
        if (s.hasNext()) {
            String token = s.next();
            if (token.equalsIgnoreCase("remove")) {
                return parseRemove(s);
            } else if (token.equalsIgnoreCase("add")) {
                return parseAdd(s);
            }  else if (token.equalsIgnoreCase("help")) {
                if (!s.hasNext()) {
                    return new HelpComand();
                }
            } else if (token.equalsIgnoreCase("list")) {
                if (!s.hasNext()) {
                    return new ListCommand();
                }
            } else if (token.equalsIgnoreCase("exit")) {
                if (!s.hasNext()) {
                    return new ExitCommand();
                }
            }
        }else {
            return new  EmptyCommand();
        }
        return null;
    }

    private AddCommand parseAdd(Scanner s) {
        if (s.hasNext()) {
            return null;
        }
            printer.println("Enter name: ");
            printer.printUserPrompt();
            String name = scanner.nextLine();
            printer.println("Enter author: ");
            printer.printUserPrompt();
            String author = scanner.nextLine();
            return new AddCommand(name, author);

    }

    private RemoveCommand parseRemove(Scanner s) {
        if (s.hasNextLong()){
            long l = s.nextLong();
            if (!s.hasNext()){
                return new RemoveCommand(l);
            }
        }
        return null;
    }
}
