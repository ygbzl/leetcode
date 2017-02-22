package Feb11_49_56;

/**
 * Created by zhupd on 2/13/2017.
 */
public class ReverseWordsInAString_151 {
    public String reverseWords(String s) {
        if (s == null ||s.length()==0) {
            return s;
        }
        char[] array = s.toCharArray();
        String newStr = cleanSpace(array);
        newStr = reverse(newStr);
        String res = "";

        char[] a=newStr.toCharArray();

        int i = 0, j = 0, n=a.length;

        while (i < n) {
            while (i < n && a[i] != ' ') {
                i++;
            }
            res+= reverse(newStr.substring(j,i)) + ' ';  // reverse the word
            j=i+1;
            i++;
        }
        return cleanSpace(res.toCharArray());


    }

    String cleanSpace(char[] chars) {
        int i=0,j=0,len=chars.length;
        while (i < len) {
            while (i<len&&chars[i] == ' ') i++;
            while (i<len&&chars[i] != ' ') chars[j++] = chars[i++];
            while (i<len&&chars[i] == ' ') i++;
            if(i<len) chars[j++] = ' ';
        }
        if(j==0) return "";
        return new String(chars).substring(0, j);
    }

    String reverse(String str) {
        if(str==null || str.length()==0) return str;
        char[] temp = str.toCharArray();
        int i = 0, j = temp.length-1;
        while (i<j){
            char t = temp[i];
            temp[i] = temp[j];
            temp[j] = t;
            i++;
            j--;
        }
        return new String(temp);
    }
    }
