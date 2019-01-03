package MySolution;

/**
 * 斐波那契数列
 * <p>
 * 求斐波那契数列的第n项的值。f(0)=0, f(1)=1, f(n)=f(n-1)+f(n-2) n>1
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
        System.out.println(fibonacci(13));// result 233
        System.out.println(fibonacciRecursive(13));// result 233
    }

    /**
     * 迭代
     * <p>
     * 已过牛客
     * <p>
     * https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=13&tqId=11160&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
     *
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new RuntimeException("n不得小于0");
        }
        if (n < 2) {
            return n;
        }
        int prepreNum = 0;
        int preNum = 1;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = prepreNum + preNum;
            prepreNum = preNum;
            preNum = result;
        }
        return result;
    }

    /**
     * 递归
     *
     * @param n
     * @return
     */
    public static int fibonacciRecursive(int n) {
        if (n < 0) {
            throw new RuntimeException("n不得小于0");
        }
        if (n < 2) {
            return n;
        }
        return fibonacciRecursive(n - 2) + fibonacciRecursive(n - 1);
    }
}
