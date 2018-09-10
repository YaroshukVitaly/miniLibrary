package by.yaroshuk.miniLibrary;

import java.io.*;

public class Reading {
    public static void red() {
        try(FileInputStream fin=new FileInputStream("F://Vitalya//miniLibrary//resources//notes.txt"))
        {
            int i=- 1;
            while((i=fin.read())!=-1){

                System.out.print((char)i);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
