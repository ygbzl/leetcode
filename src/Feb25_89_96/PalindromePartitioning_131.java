package Feb25_89_96;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhupd on 2/25/2017.
 */
public class PalindromePartitioning_131 {
    public List<List<String>> partition(String s) {
        List<List<String>> res= new LinkedList<>();
        if(s==null || s.length()==0) return res;

        backTrack(res, new LinkedList<String>(), 0,  s);
        return res;
    }

    void backTrack(List<List<String>> res, List<String> temp, int index, String s) {
        if(index==s.length()) res.add(new LinkedList<>(temp));
        else {
            for(int i=index;i<s.length();i++){
                String cur=s.substring(index,i+1);
                if(!isPara(cur)) continue;

                temp.add(cur);
                backTrack(res,temp,i+1,s);
                temp.remove(temp.size()-1);
            }
        }

    }

    boolean isPara(String s){
        int a=0,b=s.length()-1;
        while(a<b){
            if(s.charAt(a)!=s.charAt(b))
                return false;
            a++;
            b--;
        }
        return true;
    }
}
