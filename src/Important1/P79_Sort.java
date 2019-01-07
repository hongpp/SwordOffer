package Important1;

public class P79_Sort {
    /**
     * 冒泡排序
     *
     * @param data
     */
    public static void bubbleSort(int[] data) {

    }

    /**
     * 快速排序
     * https://blog.csdn.net/MoreWindows/article/details/6684558
     *
     * @param arr
     * @param head
     * @param tail
     */
    public static void quickSort(int arr[], int head, int tail) {
        if (head >= tail || arr == null || arr.length <= 1) {
            return;
        }
        int i = head, j = tail, pivot = arr[(head + tail) / 2];
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            } else if (i == j) {
                i++;
            }
        }
        quickSort(arr, head, j);
        quickSort(arr, i, tail);
    }

    public static int binarySearchRecursion(int[] array, int start, int end, int key) {
        if (start > end) {
            return -1;
        }
        int mid = (end - start) / 2 + start;
        if (key > array[mid]) {
            return binarySearch(array, mid + 1, end, key);
        } else if (key < array[mid]) {
            return binarySearch(array, start, mid - 1, key);
        } else {
            return mid;
        }
    }

    public static int binarySearch(int[] array, int start, int end, int key) {
        if (array == null || key < array[start] || key > array[end]) {
            return -1;
        }
        while (start <= end) {
            int mid = (end - start) / 2 + start;
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

