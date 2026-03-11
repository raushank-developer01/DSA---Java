import java.util.Scanner;

public class SumOfDigit {
    public static int printSumOfDigit(int num){
        int result = 0;

        while(num != 0){
            int rem = num % 10;
            result += rem;
            num /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        System.out.println(printSumOfDigit(num));
        sc.close();
    }
}
