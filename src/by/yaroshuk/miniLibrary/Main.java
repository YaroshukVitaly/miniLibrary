package by.yaroshuk.miniLibrary;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Library library = new Library();
        UserConsoleInpunReader consoleInpunReader = new UserConsoleInpunReader(library);
        consoleInpunReader.start();






      //  Entry entry = new Entry();
     //   entry.write();
      //  Reading reading = new Reading();
    //    reading.red();

    }
}
