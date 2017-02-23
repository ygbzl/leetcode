package Feb14_57_64;

/**
 * Created by zhupd on 2/22/2017.
 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int res = 0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if (grid[i][j] == '1') {
                    res++;
                    press(grid, i, j);
                }
            }
        }
        return res;
    }

    void press(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length
                || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        press(grid, i + 1, j);
        press(grid, i - 1, j);
        press(grid, i, j + 1);
        press(grid, i, j - 1);
    }

}
