package RightSolution;

/**
 * 二维数组中的查找
 * <p>
 * <p>
 * 一个二维数组中，每一行从左到右递增，每一列从上到下递增。输入一个整数，判断数组中是否含有该整数
 */
public class P44_FindInPartiallySortedMatrix {
    public boolean Find(int target, int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int indexOfRow = 0;
        int indexOfCol = cols - 1;
        while (indexOfRow < rows && indexOfCol >= 0) {
            if (target > array[indexOfRow][indexOfCol]) {
                indexOfRow++;
            } else if (target < array[indexOfRow][indexOfCol]) {
                indexOfCol--;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12},
                {4, 8, 12, 16}
        };

    }

}
