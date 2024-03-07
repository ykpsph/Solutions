public class BestTimeToBuyAndSellStockOne_122 {
    public static void main(String[] args) {
        int[] prices = {1,2};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices){
        if(prices.length == 0){
            return 0;
        }
        int maxProfit = 0;
        int buyAt = prices[0];

        for(int i = 0; i < prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i]-buyAt);
            if(prices[i] < buyAt){
                buyAt = prices[i];
            }
        }
        return maxProfit;
    }
}
