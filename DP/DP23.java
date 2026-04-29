public class DP23 {
    // Problem: Maximum Profit with Transaction Fee and Difference of Days
    // This problem is about finding the maximum profit that can be made with a transaction fee and we have to return maxProfit and days
    public static void maxProfitWithTransactionFee(int[] price, int transactionFee){
        int n=price.length;
        int hold=-price[0];// To track the maximum profit when holding a stock
        int cash=0;
        int buyDay=0, sellDay=0;
        int currentBuyDay=0;// To track the day we bought the stock
        int maxDayDiff=0;

        for(int i=1; i<n; i++){
            if(cash-price[i] > hold){// If we can buy the stock at a lower price than we currently hold
                hold=cash-price[i];// Update hold to the new maximum profit when buying
                currentBuyDay=i;// Update the day we bought the stock
            }
            if(hold+price[i]-transactionFee > cash){// If selling the stock gives us more profit than holding 
                cash=hold+price[i]-transactionFee;// Update cash to the new maximum profit when selling
                // Update buy and sell days
                buyDay=currentBuyDay;
                sellDay=i;
                maxDayDiff=sellDay - buyDay;// Calculate the difference of days between sell and buy
            }
        }
        System.out.println("Maximum Profit: " + cash);
        System.out.println("Buy Day: " + buyDay + ", Sell Day: " + sellDay);
        System.out.println("Difference of Days (Sell - Buy): " + maxDayDiff);
    }
    public static void main(String[] args){
        int[] arr ={6,1,7,2,8,4};
        int transactionFee = 2;
        maxProfitWithTransactionFee(arr, transactionFee);
    }
}
