package Jan6_17_24;

/**
 * Given an integer, write a function to determine if it is a power of two.


 * Created by zhupd on 1/10/2017.
 */
public class PowerOfTwo_231 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {

                if (count > 0) {
                    return false;
                } else {
                    count++;
                }
            }
            n >>= 1;
        }
        return true;
    }
}
