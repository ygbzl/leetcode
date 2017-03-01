package Feb26_97_104;

/**
 * Created by zhupd on 2/28/2017.
 */
public class DecodeWays_91 {
    public int numDecodings(String s) {
        if(s==null || s.length()==0) return 0;

        int[] map=new int[s.length()+1];
        map[0]=1;
        map[1]=0;
        char[] c=s.toCharArray();
        if(c[0]!='0') map[1]=1;

        for(int i=2;i<=s.length();i++) {
            if(c[i-1]!='0')
                map[i]+=map[i-1];
            if(c[i-2]!='0') {
                if((c[i-2]-'0')*10+(c[i-1]-'0')<=26){
                    map[i] +=map[i-2];
                }
            }
        }
        return map[s.length()];

    }
}
