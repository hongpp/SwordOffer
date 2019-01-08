package Important1;

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

    private static Singleton1 INSTANCE;

    public static Singleton1 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton1.class) {
                if (INSTANCE == null) {
                    return new Singleton1();
                }
            }
        }
        return INSTANCE;
    }

}

class Singleton2 {
    private Singleton2() {

    }

    private static class Holder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return Holder.INSTANCE;
    }

}

enum Singleton3 {
    INSTANCE;

    public void whatever() {

    }
}
