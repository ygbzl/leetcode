package Feb14_57_64;

import java.util.*;

/**
 * Created by zhupd on 2/21/2017.
 */
public class FindAllAnagramsInAString_438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new LinkedList<>();
        if (s.length() < p.length()) {
            return res;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char x : p.toCharArray()) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }

        int begin = 0, end = 0;
        int len = map.size();

        while (end < s.length()) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                map.put(c,map.get(c) - 1);
                if(map.get(c)==0) len--;
            }
            end++;

            while (len == 0) {
                if (end - begin == p.length()) {
                    res.add(begin);
                }
                char temp = s.charAt(begin);
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                    if(map.get(temp)>0) {
                        len++;
                    }
                }
                begin++;
            }
        }
        return res;
    }
}
