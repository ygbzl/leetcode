package AmazonVedio;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peidong on 2/13/17.
 */
public class LetterCombinationsOfAPhoneNumber_17 {
    public List<String> letterCombinations(String digits) {
        final String[] str = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new ArrayList<>();

        if (digits.length() == 0) {
            return res;
        }

        res.add("");
        for(int i=0;i<digits.length();i++) {
            res=helper(str[digits.charAt(i)-'0'], res);
        }
        return res;
    }

    private List<String> helper(String str, List<String> res) {
        List<String> newRes = new ArrayList<>();
        for(int i=0;i<str.length();i++) {
            for (String x : res) {
                newRes.add(x + str.charAt(i));
            }
        }
        return newRes;
    }
}