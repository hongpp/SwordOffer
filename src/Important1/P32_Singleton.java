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

class Singleton_DLC {
    private static volatile Singleton_DLC INSTANCE;

    private Singleton_DLC() {

    }

    public static Singleton_DLC getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton_DLC.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton_DLC();
                }
            }
        }
        return INSTANCE;
    }
}

class Singleton_Inner_Static {
    private Singleton_Inner_Static() {

    }

    private static class Holder {
        private static final Singleton_Inner_Static INSTANCE = new Singleton_Inner_Static();
    }

    public static Singleton_Inner_Static getInstance() {
        return Holder.INSTANCE;
    }
}

