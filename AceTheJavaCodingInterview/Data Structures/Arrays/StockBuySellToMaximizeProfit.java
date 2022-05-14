public class StockBuySellToMaximizeProfit {
    public static void main(String [] args){
        
    }

    public static int findBuySellStockPrices(int [] stockNums){
        if(stockNums.length == 1) return 0;
        int minPrice = stockNums[0];
        int profit = stockNums[0];
        int maxProfit = Integer.MIN_VALUE;

        for(int i = 1; i < stockNums.length; i++){
            if(minPrice > stockNums[i]){
                minPrice = stockNums[i];
            }
            profit = stockNums[i] - minPrice;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }
}
