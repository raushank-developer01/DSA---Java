package Arrays;

import java.util.Scanner;

public class StockProfit {
    
    public static int calculateMaxProfit(int[] arr){
        int currPrice = arr[0];
        int maxProfit = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= currPrice){
                int profit = arr[i] - currPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                currPrice = arr[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day size of stock");
        int day = sc.nextInt();
        int prices[] = new int[day];

        for(int i = 0; i < day; i++){
        System.out.println("Enter the price on " + i + "th day");
        prices[i] = sc.nextInt();
        }

        System.out.println(calculateMaxProfit(prices));
        sc.close();   
    }
}
