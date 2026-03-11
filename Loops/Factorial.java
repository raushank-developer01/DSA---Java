package Loops;

import java.util.Scanner;

public class Factorial {
    public static int calcualteFactorial(int num){
        if(num == 0 || num == 1) return 1;
        return num*calcualteFactorial(num - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to calculate factorial");
        int num = sc.nextInt();

        System.out.println(calcualteFactorial(num));
        sc.close();
    }
}
