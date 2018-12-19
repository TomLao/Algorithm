package LeetCode_Java;

public class Best_Time_to_Buy_and_Sell_Stock_121 {

    //算法：在j>i时，求max(prices[j]-prices[i])

    public int maxProfit(int[] prices) {
        if (prices==null||prices.length==0)
            return 0;
        int maxProfit = 0, max = prices[prices.length-1];
        for (int i = prices.length-1; i >= 0; i--) {
            maxProfit = Math.max(maxProfit, max - prices[i]);//比较已知最大值-当前值，和已知的最大收益
            max = Math.max(max, prices[i]); //从后往前max记录最大值
        }
        return maxProfit;
    }
}
