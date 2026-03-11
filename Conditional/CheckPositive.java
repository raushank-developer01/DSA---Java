package Conditional;
import java.util.Scanner;

public class CheckPositive {
    public static String CheckNumber(int num){
        if(num > 0) return "Positive";
        return "Negative";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to check is it positive or negative");
        int num = sc.nextInt();

        System.out.println(CheckNumber(num));
        sc.close();
    }
}
