package ch04;

public class CatTest {
    static void main() {
//        String cat01Name = "미묘";
//        String cat01Category = "코숏";
//        int cat01Age = 3;
//
//        String cat02Name = "러블리";
//        String cat02Category = "앙고라";
//        int cat02Age = 4;
        Cat cat01 = new Cat();//object
        cat01.name="러블리";
        cat01.age=3;

        Cat cat02 = new Cat();
        cat02.name="야옹이";
        cat02.age=4;

        Cat cat03 = cat01;

        Cat [] cats = new Cat[2];
        cats[0] = cat01;
        cats[1] = cat02;
        for(int i=0;i<cats.length;i++) {
            System.out.println(cats[i].name);
            System.out.println(cats[i].age);
        }
    }
}
