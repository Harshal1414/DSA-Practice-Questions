public class LC_121_Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProf = 0;

        for(int i = 1; i <= prices.length-1; i++){
            maxProf = Math.max(maxProf, prices[i] - minPrice);
            minPrice = Math.min(prices[i], minPrice);
        }

        return maxProf;
    }
}
