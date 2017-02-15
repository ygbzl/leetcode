package Feb11_49_56;

import java.util.ArrayList;
import java.util.List;

/**Given a digit string, return all possible letter combinations that the number could represent.

 A mapping of digit to letters (just like on the telephone buttons) is given below.
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
