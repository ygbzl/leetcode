package AmazonVedio;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhupd on 2/13/2017.
 */
public class IntegerToEnglishWord {
    private final String[] under20={"","One","Two","Three","Four","Five","Six","Seven",
            "Eight","nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen",
            "Nineteen"};
    private final String[] tens={"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    private final String[] thousands={"Thousand","Million","Billion"};

    public  String numberToString(int num) {
        if(num==0) return "Zero";
        String res = helper(num);
        return res;
    }

    private String helper(int num) {
        if (num < 20) {
            return under20[num] +" ";
        } else if (num < 100) {
            return tens[num / 10] + " " + helper(num % 10);
        } else {
            return under20[num / 100] + " Hundred " + helper(num % 100);
        }
    }

}
