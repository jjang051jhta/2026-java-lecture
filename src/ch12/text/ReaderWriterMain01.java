package ch12.text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ReaderWriterMain01 {
    static void main() throws IOException {
        String writerString = "ABC";
        byte []  writeBytes = writerString.getBytes(StandardCharsets.UTF_8);
        System.out.println("write String : "+writerString);
        System.out.println("write bytes : "+ Arrays.toString(writeBytes));
        FileOutputStream fileOutputStream = new FileOutputStream("temp/hello.txt");
        fileOutputStream.write(writeBytes);
        fileOutputStream.close(); //  flush() 남아있는 것들 한꺼번에 밀어넣기...

        //파일 읽기
        FileInputStream fileInputStream = new FileInputStream("temp/hello.txt");
        byte [] readBytes = fileInputStream.readAllBytes();
        fileInputStream.close();

        String readString =  new String(readBytes,StandardCharsets.UTF_8);
        System.out.println("read bytes : "+Arrays.toString((writeBytes)));
        System.out.println("read String : "+readString);
    }
}
