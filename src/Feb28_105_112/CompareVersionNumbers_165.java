package Feb28_105_112;

/**
 * Created by zhupd on 3/1/2017.
 */
public class CompareVersionNumbers_165 {
    public int compareVersion(String version1, String version2) {
        if(version1.equals(version2)) return 0;
        String[] s1=version1.split("\\.");
        String[] s2=version2.split("\\.");

        int n=Math.max(s1.length,s2.length);
        int num1=0,num2=0;
        for(int i=0;i<n;i++){
            if(i<s1.length){
                num1=Integer.parseInt(s1[i]);}
            else num1=0;
            if(i<s2.length)
                num2=Integer.parseInt(s2[i]);
            else num2=0;
            if(num1>num2) return 1;
            if(num1<num2) return -1;

        }
        return 0;

    }
}
