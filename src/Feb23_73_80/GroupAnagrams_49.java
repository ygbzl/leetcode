package Feb23_73_80;

import java.util.*;

/**
 * Created by zhupd on 2/23/2017.
 */
public class GroupAnagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return null;
        }
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String strKey = String.valueOf(c);
            if (!res.containsKey(strKey)) {
                res.put(strKey, new ArrayList<>());
            }  res.get(strKey).add(s);
        }
        return new ArrayList<>(res.values());
    }
      /*  List<List<String>> res = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return res;
        }
        List<int[]> map = new ArrayList<>();

        for (String x : strs) {
            if (x == "") {
                res.add(0, new ArrayList<>());
                res.get(0).add("");
            }
            if (map.size() == 0) {
                map.add(buildMap(x));
                res.add(new ArrayList<>());
                res.get(0).add(x);
                continue;
            }
            for(int i=0;i<map.size();i++) {
                if (isAnagram(map.get(i), x)) {
                    res.get(i).add(x);
                } else {
                    map.add(buildMap(x));
                    res.add(new ArrayList<>());
                    res.get(i).add(x);
                }
            }

        }
        return res;

    }

    int[] buildMap(String s) {
        int[] temp = new int[26];
        for (char c : s.toCharArray()) {
            temp[c-'a']++;
        }
        return temp;
    }
    boolean isAnagram(int[] temp, String s) {
        for (char c : s.toCharArray()) {
            temp[c-'a']--;
            if(temp[c-'a']<0) return false;
        }
        int sum=0;
        for(int i=0;i<temp.length;i++) {
            sum += temp[i];
        }
        if(sum==0) return true;
        else return false;
    }*/
}
