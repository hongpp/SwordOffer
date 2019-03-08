package MyTest;

import java.util.HashMap;
import java.util.Map;

/*
输入'0'到'9'的各数字个数
如：242142314278767868721347612
输出
 */
public class CharCount {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = "242142314278767868721347612";
        for (int i = 0; i < 10000; i++) {
            sb.append(str);
        }
        count1(sb.toString());
        count2(sb.toString());
    }

    private static void count1(String str) {
        long current = System.currentTimeMillis();
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], 1);
            } else {
                map.put(chars[i], map.get(chars[i]) + 1);
            }
        }
        System.out.println(System.currentTimeMillis() - current);
        System.out.println(map);
    }

    private static void count2(String str) {
        long current = System.currentTimeMillis();
        char[] chars = str.toCharArray();
        int[] arr = new int[10];
        for (char c : chars) {
            arr[c - '0']++;
        }
        System.out.println(System.currentTimeMillis() - current);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "=" + arr[i]);
        }
    }
}
