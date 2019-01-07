package Important2;

/**
 * 替换空格
 * <p>
 * 实现一个函数，把字符串中的每个空格都替换成“%20”，已知原位置后面有足够的空余位置，要求改替换过程发生在原来的位置上
 * <p>
 * 把传入字符数组中的' '换成'%20',且传入数组保证有足够空间容纳修改后的字符
 */


public class P51_ReplaceSpaces {


    public static void replaceBlank(char[] data, int length) {
        System.out.println(new String(data));
        int oldLength = length;
        int newLength = length;
        for (char c : data) {
            if (c == ' ') {
                newLength += 2;
            }
        }
        for (int indexOfOld = oldLength - 1, indexOfNew = newLength - 1; indexOfOld >= 0; indexOfOld--, indexOfNew--) {
            if (data[indexOfOld] == ' ') {
                data[indexOfNew--] = '0';
                data[indexOfNew--] = '2';
                data[indexOfNew] = '%';
            } else {
                data[indexOfNew] = data[indexOfOld];
            }
        }
        System.out.println(new String(data));

    }

    public static void replaceBlank(StringBuffer str) {
        System.out.println(str.toString());
        int oldLength = str.length();
        int newLength = str.length();
        char[] preData = str.toString().toCharArray();
        for (char c : preData) {
            if (c == ' ') {
                newLength += 2;
            }
        }
        char[] data = new char[newLength];
        for (int i = 0; i < preData.length; i++) {
            data[i] = preData[i];
        }
        for (int indexOfOld = oldLength - 1, indexOfNew = newLength - 1; indexOfOld >= 0; indexOfOld--, indexOfNew--) {
            if (data[indexOfOld] == ' ') {
                data[indexOfNew--] = '0';
                data[indexOfNew--] = '2';
                data[indexOfNew] = '%';
            } else {
                data[indexOfNew] = data[indexOfOld];
            }
        }
        System.out.println(new String(data));

    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("we are happy");

        char[] preData = "we are happy.".toCharArray();
        char[] data = new char[20];
        for (int i = 0; i < preData.length; i++) {
            data[i] = preData[i];
        }
        //replaceBlank(data, preData.length);
        replaceBlank(str);
    }
}
