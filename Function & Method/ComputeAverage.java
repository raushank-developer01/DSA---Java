import java.util.Scanner;

public class ComputeAverage {
    public static float calculateAverage(int[] arr){
        int sum = 0;
        for(int i = 0; i < 3; i++){
            sum += arr[i];
        }
        return sum/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];

        for(int i = 0; i < 3; i++){
             System.out.println("Enter the " + i + "th No");
             arr[i] = sc.nextInt();
        }
       System.out.println(calculateAverage(arr));
       sc.close();
    }
}
