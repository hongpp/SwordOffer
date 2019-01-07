package RightSolution;

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
        System.out.println(fibonacci(13));
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
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

    public static int fibonacci1(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 2] + memo[i - 1];
        }
        return memo[n];
    }
}
