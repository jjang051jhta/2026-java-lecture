package ch13.thread.start;

public class ManyThreadMain02 {
    static void main() {
        System.out.println(Thread.currentThread().getName()+ " : main() start");
        for(int i=0;i<100;i++){
            HelloRunnable helloRunnable = new HelloRunnable();
            Thread thread = new Thread(helloRunnable);
            thread.start();
        }
        System.out.println(Thread.currentThread().getName()+ " : main() end");
    }
}
