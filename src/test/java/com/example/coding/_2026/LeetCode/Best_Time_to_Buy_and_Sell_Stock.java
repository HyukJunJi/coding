package com.example.coding._2026.LeetCode;

/**
 * 카데인 알고리즘
 */
public class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        //7, 1, 4, 3, 6, 4
        int maxProfit = 0;
        int current = 0;

        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            current = Math.max(0, current + diff); // 손해면 리셋
            maxProfit = Math.max(maxProfit, current);
        }
        return 0 ;
    }

    public int maxProfit2(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1 ; i< prices.length ; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }


            profit = Math.max(profit, prices[i] - buyPrice);
        }
        return profit;
    }
}
