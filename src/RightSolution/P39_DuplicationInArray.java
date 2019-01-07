package RightSolution;

import java.util.HashSet;
import java.util.Set;

/**
 * https://blog.csdn.net/zjkC050818/article/details/72800175
 * <p>
 * https://www.jianshu.com/p/fb65947a2e9c
 * <p>
 * 数组中重复的数
 * <p>
 * <p>
 * 在一个长度为n的数组中，所有数字的取值范围都在[0,n-1]，但不知道有几个数字重复或重复几次，找出其中任意一个重复的数字。
 * <p>
 * 一个长度为n的数组，值的范围在0~n-1内，有一个或多个数字重复，求其中任意一个
 */
public class P39_DuplicationInArray {

    public static boolean duplicate(int numbers[], int length, int[] duplication) {
        boolean[] flag = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (flag[numbers[i]]) {
                duplication[0] = numbers[i];
                return true;
            }
            flag[numbers[i]] = true;
        }
        return false;
    }

    public static boolean duplicate1(int numbers[], int length, int[] duplication) {
        if (numbers == null) {
            return false;
        }
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!hashSet.add(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] data = {1, 2, 1};
        int length = data.length;
        int[] duplication = new int[1];

        System.out.println(duplicate(data, length, duplication));
    }
}
