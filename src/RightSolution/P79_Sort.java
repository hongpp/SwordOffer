package RightSolution;

import java.util.Arrays;

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

    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static int binarySearchRecursion(int[] array, int start, int end, int key) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;    //防止溢位
        if (key < array[mid]) {
            return binarySearchRecursion(array, start, mid - 1, key);
        } else if (key > array[mid]) {
            return binarySearchRecursion(array, mid + 1, end, key);
        } else {
            return mid;
        }
    }

    public static int binarySearch(int[] array, int start, int end, int key) {
        if (key < array[start] || key > array[end]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;    //防止溢位
            if (key < array[mid]) {
                end = mid - 1;
            } else if (key > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

