package review.access.aaa;

public class AccessInnerTest {
    static void main() {
        AccessData accessData = new AccessData();
        accessData.publicField = 1;
        accessData.publicMethod();

        accessData.defaultField=2;
        accessData.defaultMethod();

        accessData.innerAccess();

    }
}
