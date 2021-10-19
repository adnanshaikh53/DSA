package arrays;

public class Stocks {
    public static void main(String [] args) {
        int [] prices = {1,5,3,8,12};

        findStockProfit(prices);

    }

    private static void findStockProfit(int[] prices) {
        int n = prices.length;

        int [] local_minima = new int[n];
        int [] local_maxima = new int[n];

        for(int i = 0;i<=n-1;i++){
            if(prices[i]<prices[i+1]){
                local_maxima[i] = prices[i];
            }
        }

    }
}
