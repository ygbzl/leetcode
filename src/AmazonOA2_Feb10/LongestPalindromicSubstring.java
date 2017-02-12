package AmazonOA2_Feb10;

/**
 * Created by zhupd on 2/11/2017.
 */
public class LongestPalindromicSubstring {
    int start, maxLength=0;

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len <= 1) {
            return s;
        }

        for(int i=0;i<len-1;i++) {
            helper(s, i, i);
            helper(s,i, i + 1);
        }
        return s.substring(start, start + maxLength);

    }

    public void helper(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        if(maxLength<j-i-1) {
            start = i + 1;
            maxLength = j - i - 1;
        }

    }
}
