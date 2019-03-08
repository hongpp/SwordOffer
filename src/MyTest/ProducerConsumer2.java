package MyTest;

public class ProducerConsumer2 {
    private static int count = 0;
    private static int FULL = 5;
    private static String LOCK = "lock";

    public static void main(String[] args) {
        new Thread(new Consumer()).start();
        new Thread(new Producer()).start();
    }

    static class Producer implements Runnable {


        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (LOCK) {
                    if (count == FULL) {
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count++;
                    System.out.println("produce:" + 1);
                    LOCK.notifyAll();
                }

            }
        }
    }

    static class Consumer implements Runnable {


        @Override
        public void run() {
            for (; ; ) {
                synchronized (LOCK) {
                    if (count == 0) {
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count--;
                    System.out.println("consumer:" + 1);
                    LOCK.notifyAll();
                }
            }
        }
    }
}


