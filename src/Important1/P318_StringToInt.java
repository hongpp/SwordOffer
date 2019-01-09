package Important1;

/**
 * 将字符串转为整数
 * <p>
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
 * 要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 */
public class P318_StringToInt {
    /**
     * 已过牛客
     * <p>
     * https://www.nowcoder.com/practice/1277c681251b4372bdef344468e4f26e?tpId=13&tqId=11202&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
     *
     * @param str
     * @return
     */
    public static int StrToInt(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int symbol = 1;
        int index = 0;
        int sum = 0;
        char[] chars = str.toCharArray();
        if (chars[0] == '-') {
            index = 1;
            symbol = -1;
        } else if (chars[0] == '+') {
            index = 1;
            symbol = 1;
        }
        for (int i = index; i < chars.length; i++) {
            if (chars[i] < 48 || chars[i] > 57) {
                return 0;
            }
            sum = sum * 10 + (chars[i] - 48);
        }
        return symbol * sum;
    }

    public static void main(String[] args) {
        String str = "-1+25";
        System.out.println(StrToInt(str));
    }
}
