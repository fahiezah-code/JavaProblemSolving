public class BuyandSell {
    public static void main(String[] args) {
        int[] prices = new int[]{9,1,5,3,6,4,2};
        // pr[i] > pr[i+1]
        // pr[i] < pr [i+1] -> maxProfit = Max(pr[i+1]-pr[i], max)
        int result = checkProfit(prices);
        System.out.println(result);
    }

    public static int checkProfit(int[] prices){
        int maxProfit = 0;

        for(int i=0; i< prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[i] < prices[j]){
                    maxProfit = Math.max((prices[j]-prices[i]),maxProfit);
                }
            }

        }
        return maxProfit;
    }
}
