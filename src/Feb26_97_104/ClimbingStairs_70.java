package Feb26_97_104;

/**
 * Created by zhupd on 2/28/2017.
 */
public class ClimbingStairs_70 {
    public int climbStairs(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;

        int[] map=new int[n+1];

        map[0]=0;
        map[1]=1;
        map[2]=2;
        for(int i=3;i<=n;i++){
            map[i]=map[i-1]+map[i-2];
        }

        return map[n];
    }
}
