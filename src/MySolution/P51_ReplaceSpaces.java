package MySolution;

/**
 * 替换空格
 * <p>
 * 实现一个函数，把字符串中的每个空格都替换成“%20”，已知原位置后面有足够的空余位置，要求改替换过程发生在原来的位置上
 * <p>
 * 把传入字符数组中的' '换成'%20',且传入数组保证有足够空间容纳修改后的字符
 */


public class P51_ReplaceSpaces {
    /**
     * 已过牛客测试
     * https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&tqId=11155&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
     *
     * @param str
     * @return
     */
    public static String replaceBlank(StringBuffer str) {
        System.out.println(str);
        char[] preData = str.toString().toCharArray();
        int preLength = preData.length;
        int folLength = preData.length;
        for (char c : preData) {
            if (c == ' ') {
                folLength += 2;
            }
        }
        char[] folData = new char[folLength];
        for (int indexOfPre = preLength - 1, indexOfFol = folLength - 1; indexOfPre >= 0; indexOfPre--, indexOfFol--) {
            if (preData[indexOfPre] == ' ') {
                folData[indexOfFol--] = '0';
                folData[indexOfFol--] = '2';
                folData[indexOfFol] = '%';
            } else {
                folData[indexOfFol] = preData[indexOfPre];
            }
        }
        String folString = new String(folData);
        System.out.println(folString);
        return folString;
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("we are happy");
        replaceBlank(str);
    }
}
