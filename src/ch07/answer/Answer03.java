package ch07.answer;

//파일 확장자 추출하기
//다음 문자열에서 파일 확장자만 출력하시오.
//doument.pdf
public class Answer03 {
    static void main() {
        String fileName = "document.pdf";
        int idx = fileName.lastIndexOf(".");
        System.out.println(idx);
        String name =  fileName.substring(0,idx);
        String extension =  fileName.substring(idx+1);
        System.out.println("파일이름 : "+name);
        System.out.println("파일확장자 : "+extension);
        if(!extension.equals("jpg")) {
            System.out.println("프로필은 jpg만 가능합니다.");
        }
    }
}
