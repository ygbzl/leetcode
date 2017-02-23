package Feb22_65_72;

/**
 * Created by zhupd on 2/22/2017.
 */
public class RotateImage_48 {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int temp;
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n/2;j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}
