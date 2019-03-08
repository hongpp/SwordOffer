package MyTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer3 {
    private static int count = 0;
    private static int FULL = 5;
    private static ReentrantLock lock = new ReentrantLock();
    //创建两个条件变量，一个为缓冲区非满，一个为缓冲区非空
    private final static Condition notFull = lock.newCondition();
    private final static Condition notEmpty = lock.newCondition();

    public static void main(String[] args) {
        new Thread(new Consumer()).start();
        new Thread(new Producer()).start();
    }

    static class Producer implements Runnable {


        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                lock.lock();
                try {
                    if (count == FULL) {
                        notFull.await();
                    }
                    count++;
                    System.out.println("produce:" + 1);
                    notEmpty.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        }
    }

    static class Consumer implements Runnable {


        @Override
        public void run() {
            for (; ; ) {
                lock.lock();
                try {
                    if (count == 0) {
                        notEmpty.await();
                    }
                    count--;
                    System.out.println("consumer:" + 1);
                    notFull.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}


