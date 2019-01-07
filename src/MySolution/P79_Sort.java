package MySolution;

public class P79_Sort {
    /**
     * 冒泡排序
     *
     * @param data
     */
    public static void bubbleSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    /**
     * 快速排序
     *
     * @param s
     * @param l
     * @param r
     */
    public static void quickSort(int s[], int l, int r) {

        if (l < r) {
            int left = l;
            int right = r;
            int x = s[l];
            while (left < right) {
                while (left < right && x <= s[right]) {
                    right--;
                }
                if (left < right) {
                    s[left++] = s[right];
                }
                while (left < right && x > s[left]) {
                    left++;
                }
                if (left < right) {
                    s[right--] = s[left];
                }
            }
            s[left] = x;
            quickSort(s, l, left - 1);
            quickSort(s, left + 1, r);
        }

    }
}

