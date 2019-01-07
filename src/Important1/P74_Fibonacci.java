package Important1;

/**
 * 斐波那契数列
 * <p>
 * 求斐波那契数列的第n项的值。f(0)=0, f(1)=1, f(n)=f(n-1)+f(n-2) n>=2
 * <p>
 * <p>
 * 解法1
 * 依定义递归求解
 * o(n^2)
 * o(1)
 * <p>
 * <p>
 * 解法2
 * 从0开始迭代求解
 * o(n)
 * o(1)
 */
public class P74_Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci(13));
        System.out.println(Fibonacci1(13));

    }

    /**
     * 已过牛客
     * <p>
     * https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=13&tqId=11160&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
     *
     * @param n
     * @return
     */
    public static int Fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int f_n_2 = 0;// f(n-2)
        int f_n_1 = 1;// f(n-1)
        int f_n = 0;// f(n)
        for (int i = 2; i <= n; i++) {
            f_n = f_n_2 + f_n_1;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }
        return f_n;
    }

    public static int Fibonacci1(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fibonacci1(n - 2) + Fibonacci1(n - 1);
    }

}
