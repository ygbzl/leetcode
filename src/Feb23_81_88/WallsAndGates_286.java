package Feb23_81_88;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by zhupd on 2/24/2017.
 */
public class WallsAndGates_286 {
    public void wallsAndGates(int[][] rooms) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<rooms.length;i++) {
            for(int j=0;j<rooms[0].length;j++) {
                if (rooms[i][j] == 0) {
                    queue.offer(i * rooms[0].length + j);
                }
            }
        }
        int[] d = {0, 1, 0, -1, 0};
        while (!queue.isEmpty()) {
            int x = queue.poll();
            int m = x / rooms[0].length, n = x % rooms[0].length;
            for(int i=0;i<4;i++) {
                int a = m + d[i], b = n + d[i + 1];
                if (a >= 0 & a < rooms.length && b >= 0 && b < rooms[0].length && rooms[a][b] > rooms[m][n]) {
                    rooms[a][b] = rooms[m][n] + 1;
                    queue.offer(a * rooms[0].length + b);
                }
            }
        }
    }




   /* public void wallsAndGates(int[][] rooms) {
        if(rooms==null || rooms.length==0) return;
        for(int i=0;i<rooms.length;i++) {
            for(int j=0;j<rooms[0].length;j++) {
                if (rooms[i][j] == 0) {
                    walk(rooms, i, j, 0);
                }
            }
        }


    }

    public void walk(int[][] rooms, int i, int j, int len) {
        if(i<0 ||i>= rooms.length||j<0||j>=rooms[0].length || rooms[i][j]<len) return ;
        rooms[i][j]=len;
        walk(rooms, i, j + 1, len + 1);
        walk(rooms, i, j - 1, len + 1);
        walk(rooms, i - 1, j, len + 1);
        walk(rooms, i + 1, j, len + 1);
    }*/
}
