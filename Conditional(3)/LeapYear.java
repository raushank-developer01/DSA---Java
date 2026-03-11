package Conditional;

import java.util.Scanner;

public class LeapYear {
    public static void isLeap(int year){
        if (year % 400 == 0) {
            System.out.println("The year " + year + " is Leap year");

        } else if (year % 100 == 0) {
            System.out.println("The year " + year + " is not a Leap year");

        } else if (year % 4 == 0) {
            System.out.println("The year " + year + " is Leap year");

        } else {
            System.out.println("The year " + year + " is not a Leap year");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year to check it is leap year or not");
        int year = sc.nextInt();
        sc.close();
        isLeap(year);
    }
}
