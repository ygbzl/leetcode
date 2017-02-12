package AmazonOA2_Feb10;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by peidong on 2/11/17.
 */
public class FindKNearestPoint {
    public Point[] Solution(Point[] array, Point origin, int k) {
        Point[] res = new Point[k];
        int index = 0;
        PriorityQueue<Point> pq = new PriorityQueue<>(k, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return (int) (getDistance(o1, origin) - getDistance(o2, origin));
            }
        });

        for(int i=0;i<array.length;i++) {
            pq.offer(array[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            res[index] = pq.poll();
            index++;
        }
        return res;

    }

    public double getDistance(Point a, Point b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }
}

 class Point {
    double x;
    double y;

    public Point(double a, double b) {
        x = a;
        y = b;
    }
}
