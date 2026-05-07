package ch13.thread.control.interupt;

import static ch13.utils.ThreadUtil.sleep;

import static ch13.utils.MyLogger.log;

public class ThreadStopMain02 {
    static void main() {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask);
        thread.start();
        sleep(4000);
        log("작업중단 지시 thread.interrupt()");
        thread.interrupt();
        log("work 스레드 인터럽트 상태 1 = "+ thread.isInterrupted());
    }
    static class MyTask implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    log("작업중");
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                log("work 스레드 인터럽트 상태 2 = "+Thread.currentThread().isInterrupted());
                log("interrupt message  = "+e.getMessage());
                log("state  = "+Thread.currentThread().getState());
            }
            log("자원 정리");
            log("자원 종료");
        }
    }
}
