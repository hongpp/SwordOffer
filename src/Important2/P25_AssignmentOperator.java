package Important2;

/**
 * https://www.jianshu.com/p/3f024a03176b
 * <p>
 * 赋值运算符函数
 * <p>
 * 为自定义类添加赋值运算符函数，考察一些细节点的书写
 * <p>
 * 赋值运算符函数
 * 1.对于传入的参数，不应该被修改，使用final修饰；
 * 2.如果两个对象相同或值相等，不进行操作，直接返回；
 * 3.返回值最好为this，这样可以使赋值链接起来。
 * 一个缺点：此赋值从左到右进行，a=b=c等价于a=c，b不会被赋值；
 * 而如果是String的=运算，a,b都会被赋成c的值。
 */

public class P25_AssignmentOperator {
    public static class MyString {
        private String value;

        public MyString(String value) {
            this.value = value;
        }

        public MyString assign(final MyString another) {
            if (this == another || this.value.equals(another.value)) {
                return this;
            }
            this.value = another.value;
            return this;
        }

        @Override
        public String toString() {
            return "MyString{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        MyString a = new MyString("a");
        MyString b = new MyString("b");
        MyString c = new MyString("c");
        System.out.println(a);
        a.assign(b);
        System.out.println(a);
        System.out.println(b);
    }
}
