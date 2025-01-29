package dev.dinesh;

public class BestDayToBuySell {
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int tempMin = prices[0];
        int tempMinIndex = 0;
        int tempMax = prices[prices.length - 1];
        int tempMaxIndex = prices.length - 1;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < tempMin) {
                tempMin = prices[i];
                tempMinIndex = i;
            } else if (prices[i] > tempMax) {
                tempMax = prices[i];
                tempMaxIndex = i;
            }
        }

        System.out.println("Output: " + (tempMax - tempMin));
        System.out.println("Buy on Day " + (tempMinIndex + 1) + " and Sell on Day " + (tempMaxIndex + 1));

    }
}
