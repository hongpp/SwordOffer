package Important1;

/**
 * https://www.jianshu.com/p/010410a4d419
 * 实现单例模式
 * <p>
 * 设计一个类，只能生成该类的一个实例。
 * 1.构造方法私有
 * 2.延迟加载
 * 3.线程安全
 * 4.确保反序列换时不会重新构建对象。
 * 属于被动引用，JVM 的<clinit>方法 保证线程同步、加锁
 * <clinit> 初始化类变量，会在类加载过程中的“加载”初始化static变量（类变量）
 * <init> 初始化实例变量
 */
public class P32_Singleton {
    public static void main(String[] args) {

    }
}

class Singleton {
    private Singleton() {

    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

