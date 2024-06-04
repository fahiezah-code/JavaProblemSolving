package javaPractise;

public class BuyAndSell {

    //input [7,1,5,3,6,4]
    //output 7 (profit = (5-1) + (6-3)

    public static void main(String[] args) {

        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(getProfit(prices));
        System.out.println(maxProfit(prices));
        System.out.println(maxProfitByBruteForce(prices));
    }
    public static int getProfit(int[] prices){
        int totalProfit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i] > prices[i-1]){
                totalProfit += prices[i] - prices[i-1];
            }
        }
        return totalProfit;
    }

    //find maxProfit , --> return 5
    public static int maxProfit(int[] prices) {

        //day 1 < day 2, maxProfit= 0, maxp\\\ = day2- day1

        int min = prices[0];
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++){
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(maxProfit,(prices[i]-min));
        }
        return maxProfit;

    }

    public static int maxProfitByBruteForce(int [] prices){
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            for(int j=1; j<prices.length; j++){
                if(prices[j]>prices[i]){
                   maxProfit = Math.max(maxProfit,(prices[j] - prices[i])) ;
                }
            }
        }
        return maxProfit;
    }

}
