package Feb23_73_80;

import java.util.Arrays;

/**
 * Created by zhupd on 2/23/2017.
 */
public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        if (s == null || s.length() != t.length()) {
            return false;
        }
        int[] map = new int[26];
        for(int i=0;i<s.length();i++) {
            map[s.charAt(i)-'a']++;
            map[t.charAt(i) - 'a']--;
        }
        for(int i=0;i<map.length;i++) {
            if (map[i] != 0) {
                return false;
            }
        }
        return true;






/*        if (s == null || s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray();
        Arrays.sort(a);
        String news = String.valueOf(a);
        char[] b = t.toCharArray();
        Arrays.sort(b);
        String newt = String.valueOf(b);
        return newt.equals(news);*/
    }
}
