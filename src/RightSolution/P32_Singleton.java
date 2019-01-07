package RightSolution;

/**
 * https://www.jianshu.com/p/010410a4d419
 * 实现单例模式
 * <p>
 * 设计一个类，只能生成该类的一个实例。
 */
public class P32_Singleton {
    public static void main(String[] args) {

    }
}

class Singleton1 {
    private Singleton1() {

    }

    private static class Holder {
        private static final Singleton1 INSTANCE = new Singleton1();
    }

    public static Singleton1 getInstance() {
        return Holder.INSTANCE;
    }


}

class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}

enum Singleton3 {
    INSTANCE;

    public void whatever() {

    }
}
