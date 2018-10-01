package by.yaroshuk.miniLibrary;

import java.beans.SimpleBeanInfo;
import java.io.PrintStream;
import java.text.SimpleDateFormat;

public class OutputPrinter {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    private PrintStream outStream;

    public OutputPrinter(PrintStream outStream) {
        this.outStream = outStream;
    }

    public void printSeparator(){
        outStream.println("-----------------------------------------------------");
        outStream.println();
    }

    public void println(String s){

        outStream.println(s);
    }
    public void print(String s){
    outStream.print(s);
    }

    public void printf (String format, Object... args){

        outStream.printf(format, args);
    }

    public void printUserPrompt (){

        outStream.print(">> ");
    }
    public void print(Book book){
        printAlign( "Id", book.getId());
        printAlign( "Название ", book.getName());
        printAlign("Автор ", book.getAuthor());

    }

    public void printAlign(String caption, String data){
        outStream.printf("%10s: %s%n", caption, data);
    }
    public void printAlign(String caption, Object data){
        printAlign(caption, data.toString());
    }

    public void println() {
        printf("%n  ");
    }

    public void printSmallSeparator() {
        outStream.println("-------------");

    }

    public void printHelp(UserCommandLineCommand command) {
        String fullName = command.getName();
        for (UserCommandLineCommand.Parameter parameter : command.getParameters()) {
            fullName += " [" + parameter.getName() + "]";
        }
        outStream.printf("%15s - %s%n", fullName, command.getDescription());
        for (UserCommandLineCommand.Parameter    parameter : command.getParameters()) {
            outStream.printf("%20s: %s%n", parameter.getName(), parameter.getDescription());
        }
    }

    public void printHelp() {
        printSeparator();
        printHelp(new UserCommandLineCommand("add", "Добавить новую книгу в библиотеку."));
        printHelp(new UserCommandLineCommand("remove", "Удалить выбранную книгу.", new UserCommandLineCommand.Parameter("id", "номер книги.")));
        printHelp(new UserCommandLineCommand("send", "Cохранить книги."));
        printHelp(new UserCommandLineCommand("list", "Вывести список всех книг в библиотеке."));
        printHelp(new UserCommandLineCommand("help", "Вывести список команд."));
        printHelp(new UserCommandLineCommand("exit", "Выйти из программы"));
        println();
        printSeparator();
    }
}
