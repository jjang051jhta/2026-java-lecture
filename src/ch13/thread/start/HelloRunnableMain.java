package ch13.thread.start;

import ch13.utils.MyLogger;

public class HelloRunnableMain {
    static void main() {
        //System.out.println(Thread.currentThread().getName()+ " : main() start");
        MyLogger.log("main() start");
        HelloRunnable helloRunnable = new HelloRunnable();
        Thread thread = new Thread(helloRunnable);
        thread.start();
        //System.out.println(Thread.currentThread().getName()+ " : main() end");
        MyLogger.log("main() end");
    }
}
