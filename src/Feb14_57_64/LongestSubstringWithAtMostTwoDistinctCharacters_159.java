package Feb14_57_64;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

 For example, Given s = “eceba”,

 T is "ece" which its length is 3.
 * Created by zhupd on 2/22/2017.
 */
public class LongestSubstringWithAtMostTwoDistinctCharacters_159 {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int begin=0,end=0,len=0,count=0;
        while (end < s.length()) {
            char x = s.charAt(end);
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
            if(map.get(x)==1) count++;
            end++;

            while (count > 2) {
                char temp = s.charAt(begin);
                map.put(temp, map.get(temp) - 1);
                if (map.get(temp) == 0) {
                    count--;
                }
                begin++;
            }

            len = Math.max(len, end - begin);
        }
        return len;
    }
}
