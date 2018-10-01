package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Library;
import by.yaroshuk.miniLibrary.OutputPrinter;

public class HelpComand implements UserCommand {
    @Override
    public void execute(Library library, OutputPrinter printer) {
        printer.println("You can use following command: ");
        printer.printSeparator();
        printer.printHelp("add", "Добавить новую книгу в библиотеку.");
        printer.printHelp("remove <<id>>", "Удалить выбранную книгу.");
        printer.printHelp("send", "Cохранить книги.");
        printer.printHelp("list", "Вывести список всех книг в библиотеке.");
        printer.printHelp("help", "Вывести список команд.");
        printer.printHelp("exit", "Выйти из программы");
        printer.println();
        printer.printSeparator();
    }
}
