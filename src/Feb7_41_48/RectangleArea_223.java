package Feb7_41_48;

/**
 * Created by zhupd on 2/10/2017.
 * Find the total area covered by two rectilinear rectangles in a 2D plane.

 Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
 */
public class RectangleArea_223 {
    public int computerArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int left = Math.max(A, E);
        int right = Math.min(G, C);
        int top = Math.min(D, H);
        int bottom = Math.max(B, F);

        int mixArea = (right - left) * (top - bottom);
        int areaA = (C - A) * (D - B);
        int areaB = (G - E) * (H - F);

        if (E>=C || G <= A || D <= F || B >= H) {
            return areaA+areaB;
        }


        return areaA + areaB - mixArea;
    }
}
