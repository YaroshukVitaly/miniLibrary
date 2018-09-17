package by.yaroshuk.miniLibrary;

import java.util.List;
import java.util.Scanner;

public class UserConsoleInpunReader {
    private Scanner scanner;
    private Library library;

    public UserConsoleInpunReader(Library library) {
        this.library = library;
        scanner = new Scanner(System.in);
    }

    public void start (){
        while (true){
            String line = scanner.nextLine();
            parseAndExecuteLine(line);
        }
    }

    private void parseAndExecuteLine(String line) {
        Scanner s = new Scanner(line);
        // remove 2
        String token = s.next();
        if (token.equalsIgnoreCase(  "remove")){
            if (s.hasNextLong()){
                long l = s.nextLong();
                if (s.hasNext()){
                    System.out.println("Unknown format:" + line);
                }else {
                    remove(l);
                }
            }else if (s.hasNext()){
                System.out.println("Unknown format:" + line);
            }else {
                System.out.println("Wrong format: remove $id - no $id:" + line);
            }
        }else if (token.equalsIgnoreCase("add")){
            if (s.hasNext()){
                System.out.println("Unknown format:" + line);
            }else {
                add();
            }
        }else if (token.equalsIgnoreCase("send")){
            if (s.hasNext()){
                System.out.println("Unknown format:" + line);
            }else {
                send();
            }
        }else if (token.equalsIgnoreCase("help")){
            if (s.hasNext()){
                System.out.println("Unknown format:" + line);
            }else {
                help();
            }
        }else if (token.equalsIgnoreCase("list")){
            if (s.hasNext()){
                System.out.println("Unknown format:" + line);
            }else {
                list();
            }
        }else if (token.equalsIgnoreCase("exit")){
            if (s.hasNext()){
                System.out.println("Unknown format:" + line);
            }else {
                exit();
            }
        }else {
            processUnknownComand(line);
        }
    }

    private void send() {
        System.out.println("SENDING....");
        List<Long> longs = library.sendOnSave();
        System.out.println("Following books was save " + longs);
    }

    private void help() {
        System.out.println("HELP!");
    }

    private void list() {
        System.out.println("LISTING....");
        System.out.println("Books in a library: ");
        for (Book book : library.list()){
            System.out.println(book);
        }
    }

    private void add() {
        System.out.println("ADING...");
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter author: ");
        String author = scanner.nextLine();
        library.add(name, author);
    }

    private void remove(long l) {
        System.out.println("REMOVING" + l);
        boolean delete = library.delete(l);
        if (delete){
            System.out.println("Book " + l + " was successfully removed!");
        }else {
            System.out.println("Book " + l + " was not found!");
        }

    }

    private void processUnknownComand(String line) {
        System.out.println("Unknown comand: " + line);
    }

    private void exit() {
        System.out.println("Exiting.....");
        System.exit(0);
    }
}
