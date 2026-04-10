package ch04;

public class Book {
    String title;
    String author;
    // this는  class 자신을 가리킨다.
    // 주로 멤버 변수에 접근할때 쓴다.
    // 생략이 가능하다.
    Book() {
        this("제목없음","작자미상");
    }
    Book(String title) {
        this.title = title;
        author = "작자미상";
        //this(title,"작자미상");
    }
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    void showInfo() {
        System.out.println
                ("작가는 "+author+", 제목은 "+title);
    }
}
