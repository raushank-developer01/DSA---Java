package Loops;

import java.util.Scanner;

public class OddEvenSum {
    public static void oddEvenSum(int num, Scanner sc){
        int evenSum = 0;
        int oddSum = 0;
       
        for(int i = 1; i <= num; i++){
            System.out.println("Enter the " + i + " no");
            int no = sc.nextInt();
            if(no % 2 == 0){
                evenSum += no;
            }else{
                oddSum += no;
            }
        }
        
        System.out.println("The sum of Even no is:- " + evenSum);
        System.out.println("The sum of Odd no is:- " + oddSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of numbers you want to add");
        int num = sc.nextInt();
        oddEvenSum(num, sc);
        sc.close();
    }
}
