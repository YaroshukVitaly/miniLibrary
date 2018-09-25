package by.yaroshuk.miniLibrary;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Entry {

   public static void write() {
        printer.println("Введите книгу!");
       Scanner scannerMetod = new Scanner(System.in);
       String text = scannerMetod.nextLine(); // строка для записи
        try (
                FileOutputStream fos = new FileOutputStream("F://Vitalya//miniLibrary//resources//library.txt")) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (
                IOException ex) {

            printer.println(ex.getMessage());
        }
        printer.println("Информация была запсана.");
    }
}
