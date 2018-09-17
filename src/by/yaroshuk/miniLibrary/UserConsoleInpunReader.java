package by.yaroshuk.miniLibrary;

import com.sun.corba.se.spi.ior.IdentifiableFactory;

import java.util.Scanner;

public class UserConsoleInpunReader {
    private Scanner scanner;

    public UserConsoleInpunReader() {
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

    private void remove(long l) {
        System.out.println("REMOVING" + l);
    }

    private void processUnknownComand(String line) {
        System.out.println("Unknown comand: " + line);
    }

    private void exit() {
        System.out.println("Exiting.....");
        System.exit(0);
    }
}
