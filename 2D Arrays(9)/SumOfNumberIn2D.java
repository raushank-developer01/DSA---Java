import java.util.Scanner;

public class SumOfNumberIn2D {
    public static int sumOfRow(int[][] nums, int row){
        int sum = 0;
        for(int i = 0; i < nums[0].length; i++){
            sum += nums[row][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nums = {
            {1, 4, 9},
            {11, 4, 3},
            {2, 2, 3}
        };
        System.out.println("Enter the row you want to sum");
        int row = sc.nextInt();

        System.out.println("The sum of row " + row + " is " + sumOfRow(nums, row));
        sc.close();
    }
}
