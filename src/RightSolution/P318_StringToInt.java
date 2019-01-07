package RightSolution;

/**
 * 将字符串转为整数
 * <p>
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
 * 要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 */
public class P318_StringToInt {
    public static int StrToInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        char chars[] = str.toCharArray();
        int index = 0;
        int symbol = 1;// 正负号,1代表正号，-1代表符号，默认为正号
        if (chars[0] == '-') {
            index = 1;
            symbol = -1;// 负号
        }
        if (chars[0] == '+') {
            index = 1;
            symbol = 1;// 正号
        }
        int sum = 0;
        for (int i = index; i < chars.length; i++) {
            //48为ASCII中的0，57为ASCII中的9
            if (chars[i] < 48 || chars[i] > 57) {
                return 0;
            }
            sum = sum * 10 + (chars[i] - 48);// (chars[i] - 48)将char类型转为int类型
        }
        return symbol * sum;
    }

    public static void main(String[] args) {
        String str = "-1+25";
        System.out.println(StrToInt(str));
    }
}
