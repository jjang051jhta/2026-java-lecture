package ch12.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewFilesMain {
    static void main() throws IOException {
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
        //4. 파일 삭제
        //Files.delete(file);
        //System.out.println("File deleted");

        //5. isRegularFile()  파일인지 아닌지...
        System.out.println("Is Regular File : "+Files.isRegularFile(file));

        //6. isDirectory()  파일인지 아닌지...
        System.out.println("Is Directory : "+Files.isDirectory(directory));

        //7. getName()  이름 반환...
        System.out.println("File name : "+file.getFileName());

        //8. size()  크기 반환...
        System.out.println("File size : "+Files.size(file)+"byte");



    }
}
