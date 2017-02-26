package Feb22_65_72;

/**
 * Created by zhupd on 2/23/2017.
 */
public class FirstUniqueCharacterInAString_387 {
    public int firstUniqChar(String s) {
        int[] num = new int[26];
        for (char x : s.toCharArray()) {
            num[x - 'a']++;
        }
        int i=0;
        for(;i<s.length();i++) {
            if (num[s.charAt(i) - 'a'] == 1) {
                break;
            }
        }
        if(i>=s.length()) return -1;
        return i;
    }
}
