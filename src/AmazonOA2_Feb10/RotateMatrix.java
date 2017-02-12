package AmazonOA2_Feb10;

/**
 * Created by zhupd on 2/11/2017.
 */
public class RotateMatrix {
    public int[][] rotate(int[][] matrix, int flag) {
        int m = matrix.length;//row length
        int n = matrix[0].length;//column length
        if (m == 0 || n == 0 || matrix == null) {
            return matrix;
        }

        //change row and column
        int[][] midMatrix = new int[n][m];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                midMatrix[j][i] = matrix[i][j];
            }
        }

        //sort mid matrix, flag==1 as for clockwise, 0 as for countclockwise
        //with constant space complexity  --- int temp
        //with no extra space, a=a^b; b=a^b; a=a^b;
        int temp;
        if (flag == 1) {
            for(int i=0;i<n;i++) {
                for (int j = 0; j < m / 2; j++) {
                    temp = midMatrix[i][j];
                    midMatrix[i][j] = midMatrix[i][m - 1 - j];
                    midMatrix[i][m - 1 - j] = temp;
                }
            }
        } else if (flag == 0) {
            for(int i=0;i<n/2;i++) {
                for(int j=0;j<m;j++) {
                    temp = midMatrix[i][j];
                    midMatrix[i][j] = midMatrix[n - 1 - i][j];
                    midMatrix[n - 1 - i][j] = temp;
                }
            }
        }
        return midMatrix;
    }
}
