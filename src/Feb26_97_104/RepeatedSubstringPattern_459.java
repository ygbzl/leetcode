package Feb26_97_104;

/**
 * Created by zhupd on 2/27/2017.
 */
public class RepeatedSubstringPattern_459 {
    public boolean repeatedSubstringPattern(String s) {
        int len=s.length();
        for(int i=len/2;i>=1;i--) {
            if(len%i==0) {
                int count=len/i;
                String temp=s.substring(0,i);
                int j=1;
                for(;j<count;j++) {
                    if(!temp.equals(s.substring(j*i,(j+1)*i))) break;
                }
                if(j==count) return true;
            }
        }
        return false;
    }
}
