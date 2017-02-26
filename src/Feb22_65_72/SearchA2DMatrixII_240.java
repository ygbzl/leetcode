package Feb22_65_72;

/**
 * Created by zhupd on 2/23/2017.
 */
public class SearchA2DMatrixII_240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0) return false;
        int row = 0, col = matrix[0].length-1;
        while (row < matrix.length && col >= 0) {
            int temp = matrix[row][col];
            if(target==temp) return true;
            if(target<temp) col--;
            if(target>temp) row++;
        }
        return false;
    }

}
