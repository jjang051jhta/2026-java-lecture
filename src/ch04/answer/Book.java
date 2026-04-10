package ch04.answer;

public class Book {
    String title;
    String author;
    int price;
    Book() {
        title = "제목없음";
        author = "저자 없음";
        price = 1000;
        //this("제목없음","저자없음",1000);
    }
    Book(String title,String author) {
        this.title = title;
        this.author = author;
        price = 1000;
        //this(title,author,1000);
    }
    Book(String title,String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void showInfo() {
        System.out.println("제목 : "+title+" / 작가 : "+author+" /  가격 : "+price);
    }
}
