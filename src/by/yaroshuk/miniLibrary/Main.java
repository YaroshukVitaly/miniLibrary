package by.yaroshuk.miniLibrary;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Library library = new Library(5);
        library.add("Война и мир", "Толстой");
        library.add("Война и мир", "Толстой");
        library.add("Война и мир", "Толстой");
        library.add("Война и мир", "Толстой");
        library.add("Война и мир", "Толстой");

        System.out.println(library);

      //  Entry entry = new Entry();
     //   entry.write();
      //  Reading reading = new Reading();
    //    reading.red();

    }
}
