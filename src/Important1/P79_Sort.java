package Important1;

public class P79_Sort {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 0, 9, 3, 12, 7, 8, 3, 4, 65, 22};
        System.out.println("basic");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("bubble");
        bubbleSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("quick");
        quickSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    /**
     * 冒泡排序
     *
     * @param array
     */
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    /**
     * 快速排序
     * https://blog.csdn.net/MoreWindows/article/details/6684558
     *
     * @param array
     * @param start
     * @param end
     */
    public static int[] quickSort(int[] array, int start, int end) {
        if (array == null || start >= end || array.length == 0) {
            return array;
        }
        int i = start;
        int j = end;
        int benchMark = (start + end) / 2;
        while (i <= j) {
            while (array[i] < array[benchMark]) {
                i++;
            }
            while (array[j] > array[benchMark]) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            } else {
                i++;
            }
        }
        quickSort(array, start, j);
        quickSort(array, i, end);
        return array;
    }

    /**
     * 二分查找
     * @param array
     * @param start
     * @param end
     * @param key
     * @return
     */
    public static int binarySearch(int[] array, int start, int end, int key) {
        if (array == null) {
            return -1;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key > array[mid]) {
                start = mid + 1;
            } else if (key < array[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

