package Feb28_105_112;

/**
 * Created by zhupd on 3/1/2017.
 */
public class CountPrime_204 {
    public int countPrimes(int n) {
        boolean[] notP=new boolean[n];
        int res=0;
        for(int i=2;i<n;i++){
            if(notP[i]) continue;

            res++;
            for(int j=2*i;j<n;j=j+i){
                notP[j]=true;
            }
        }
        return res;
    }
}
