package Feb14_57_64;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

 For example,
 S = "ADOBECODEBANC"
 T = "ABC"
 Minimum window is "BANC".
 * Created by zhupd on 2/22/2017.
 */
public class MinimumWindowSubstring_76 {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        int len=s.length()+1;
        Map<Character, Integer> map = new HashMap<>();
        for (char x : t.toCharArray()) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }

        int begin = 0, end = 0;
        int cur=0;
        int count=map.size();

        while (end < s.length()) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    count--;
                }
            }
            end++;

            while (count == 0) {
                char temp = s.charAt(begin);
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                    if (map.get(temp) > 0) {
                        count++;
                    }
                }
                if (len > end - begin) {
                    len = end - begin;
                    cur=begin;
                }
                begin++;
            }
        }
        if(len==s.length()+1) return "";
        return s.substring(cur, cur + len);
    }
}
