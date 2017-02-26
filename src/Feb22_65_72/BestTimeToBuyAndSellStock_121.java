package Feb22_65_72;

/**
 * Created by zhupd on 2/23/2017.
 */
public class BestTimeToBuyAndSellStock_121 {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0) return 0;
        int min = prices[0], max = 0;
        for(int i=0;i<prices.length;i++) {
            if (prices[i] > min) {
                max = Math.max(max, prices[i] - min);
            } else {
                min = prices[i];
            }
        }
        return max;
    }
}
