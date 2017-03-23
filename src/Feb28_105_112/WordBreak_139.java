package Feb28_105_112;

import java.util.List;

/**
 * Created by zhupd on 3/1/2017.
 */
public class WordBreak_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;

        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j] && wordDict.contains(s.substring(j,i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

}
