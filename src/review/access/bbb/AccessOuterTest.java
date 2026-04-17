package review.access.bbb;

import review.access.aaa.AccessData;

public class AccessOuterTest {
    static void main() {
        AccessData accessData = new AccessData();
        accessData.publicField = 1;
        accessData.publicMethod();

//        accessData.defaultField=2;
//        accessData.defaultMethod();

        accessData.innerAccess();

    }
}
