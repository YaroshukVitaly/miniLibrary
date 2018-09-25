package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Library;

public class HelpComand implements UserCommand {
    @Override
    public void execute(Library library) {
        System.out.println("You can use following command: ");
        System.out.println("add");
        System.out.println("send");
        System.out.println("list");
        System.out.println("remove <<id>>");
        System.out.println("help");
        System.out.println("exit");
    }
}
