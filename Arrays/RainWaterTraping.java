package Arrays;

import java.util.Scanner;

public class RainWaterTraping {
    public static int trapWater(int[] height){

        int n = height.length;

        // edge case : no bar no water.
        if(n == 0) return 0;

        int leftMax[] = new int[n];

        // highest bar from left.
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        int rightMax[] = new int[n];

        // highest bar form right.
        rightMax[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0 ; i--){
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // total water trap inside bar.
        int totalWater = 0;
        for(int i = 0; i < n; i++){
            totalWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        
        return totalWater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of non-negative elevation map");
        int size = sc.nextInt();
        int height[] = new int[size];

        for(int i = 0; i < size; i++){
            System.out.println("Enter the height at " + i + "th position");
            height[i] = sc.nextInt();
        }

        System.out.println("The maximum trap water is: " + trapWater(height));
        sc.close();
    }
}
