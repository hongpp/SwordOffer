package MySolution;

import java.util.ArrayList;
import java.util.List;

/**
 * 调整数组顺序使奇数位于偶数前面
 * <p>
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class P129_ReorderArray {
    /**
     * 已过牛客
     * https://www.nowcoder.com/practice/beb5aa231adc45b2a5dcc5b62c93f593?tpId=13&tqId=11166&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
     *
     * @param array
     */
    public void reOrderArray(int[] array) {
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddList.add(array[i]);
            } else {
                evenList.add(array[i]);
            }
        }
        oddList.addAll(evenList);
        for (int i = 0; i < oddList.size(); i++) {
            array[i] = oddList.get(i);
        }
    }
}
