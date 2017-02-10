package AmazonOA2_Feb10;

/**
 * Created by zhupd on 2/10/2017.
 */
public class OverlapRectangle {
    public static boolean overLap(Node topLeftA, Node topLeftB,
                                  Node bottomRightA, Node bottomRightB) {

        if (topLeftA.x >= bottomRightB.x || bottomRightA.x <= topLeftB.x
                || bottomRightB.y >= topLeftA.y || bottomRightA.y >= topLeftB.y) {
            return false;
        } else {
            return true;
        }
    }

    public static class Node {
        double x;
        double y;

        public Node(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }


}
