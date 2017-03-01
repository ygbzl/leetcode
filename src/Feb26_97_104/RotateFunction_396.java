package Feb26_97_104;

/**
 * Created by zhupd on 2/27/2017.
 */
public class RotateFunction_396 {
    public int maxRotateFunction(int[] A) {
        int len=A.length;
        int sum=0;
        int subtract=0;

        for(int i=0;i<len;i++) {
            sum=sum + i*A[i];
            subtract+=A[i];

        }
        int max=sum;
        for(int i=len-1;i>=1;i--) {
            sum=sum+subtract-len*A[i];
            max=Math.max(max,sum);
        }
        return max;





    }
}
