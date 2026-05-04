package ch12.etc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {
    static void main() throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("temp/print.txt");
        PrintStream printStream = new PrintStream(fileOutputStream);
        printStream.println("hello java");
        printStream.println(10);
        printStream.println(true);
        printStream.printf("hello %s","world");
        printStream.close();
        System.out.println("hello world");
    }
}
