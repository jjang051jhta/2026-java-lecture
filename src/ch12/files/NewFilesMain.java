package ch12.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewFilesMain {
    static void main() {
        Path file = Path.of("temp/example.txt");
        Path directory = Path.of("temp/exampleDir");
        //1. 파일이나 디렉토리 존재 여부
        System.out.println("File exists : "+ Files.exists(file));
        //2. 파일을 생성
        try {
            Files.createFile(file);
            System.out.println("File created");
        } catch (IOException e) {
            System.out.println(file+" File already exists");
        }
    }
}
