package leetcode75;

public class bestTimeToBuyAndSellStock {


    public static void main(String[] args) {
        int[] prices = {7, 1, 2, 4, 6, 8, 19};

        bestTimeToBuyAndSellStock obj = new bestTimeToBuyAndSellStock();
        int result = obj.maxProfit(prices);
        System.out.println("Max Profit: " + result);

    }

        public int maxProfit(int[] prices) {
           int minPrice = Integer.MAX_VALUE;
           int maxProfit = 0;

           for (int price : prices){
               if (price < minPrice){
                   minPrice = price;
               } else{
                   int profit = price - minPrice;
                   maxProfit = Math.max(maxProfit, profit);
               }
           }
           return maxProfit;
        }
    }


