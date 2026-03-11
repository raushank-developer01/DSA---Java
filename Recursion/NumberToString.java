package Recursion;

import java.util.Scanner;

public class NumberToString {
    static String digits[] ={"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public static void printCorresString(int num){
        if(num == 0){
            return;
        }
        
        int rem = num % 10;
        printCorresString(num / 10);
       
        
        System.out.print(digits[rem] + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        printCorresString(num);
        sc.close();
    }
}
