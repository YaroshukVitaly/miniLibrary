package by.yaroshuk.miniLibrary;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Entry {

    public static void write() {
        System.out.println("Введите книгу!");
        Scanner scannerMetod = new Scanner(System.in);
        String text = scannerMetod.nextLine(); // строка для записи
        try (
                FileOutputStream fos = new FileOutputStream("F://Vitalya//miniLibrary//resources//notes.txt")) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (
                IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
}
