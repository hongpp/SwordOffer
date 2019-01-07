package Important1;

/**
 * 二进制中1的个数
 * <p>
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class P100_NumberOf1InBinary {
    /**
     * 已过牛客
     * <p>
     * https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8?tpId=13&tqId=11164&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
     *
     * @param n
     * @return
     */
    public int NumberOf1(int n) {
        if (n == 0) {
            return 0;
        }
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }

    public int NumberOf1_(int n) {
        char[] chars = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                count++;
            }
        }
        return count;
    }
}
