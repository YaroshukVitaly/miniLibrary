package by.yaroshuk.miniLibrary;

import java.io.PrintStream;

public class OutputPrinter {
    private PrintStream outStream;

    public OutputPrinter(PrintStream outStream) {
        this.outStream = outStream;
    }
    public void println(String s){
        outStream.println(s);

    }public void print(String s){
        outStream.print(s);
    }
    public void printf (String format, Object... args){
        outStream.printf(format, args);
    }

    public void printUserPrompt (){
        outStream.print(">> ");
    }
}