package Jan6_17_24;

/**
 * Created by zhupd on 1/8/2017.
 */
public class SearchA2DMatrix_74 {
    public static void main(String[] args) {
        int[][] matr = {{1, 3, 5, 7}, {10, 11, 16, 20},
                {23, 30, 34, 50}};
        searchMatrix(matr, 3);
    }
    public static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0
                || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0, high = m - 1;
        while (low < high-1) {
            int mid = (low + high) / 2;
            if (matrix[mid][0] == target) {
                return true;
            } else if (matrix[mid][0] > target) {
                high = mid;
            } else {
                low = mid;
            }
        }
        int temp = target >= matrix[high][0] ? high : low;
        int left = 0, right = n - 1;
        if (n == 1) {
            if (matrix[temp][0] == target) {
                return true;
            } else {
                return false;
            }
        }
        while (left <= right) {
            int mid = (left + right) / 2;
            if (matrix[temp][mid] == target) {
                return true;
            } else if (matrix[temp][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return false;

    }
}
