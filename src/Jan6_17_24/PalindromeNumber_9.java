package Jan6_17_24;

/**
 * Created by zhupd on 1/6/2017.
 */
public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev = 0;
        while (temp > 0) {
            int y = temp % 10;
            temp = temp / 10;
            rev = rev * 10 + y;
        }
        if (rev == x) {
            return true;
        } else {
            return false;
        }
    }
}
