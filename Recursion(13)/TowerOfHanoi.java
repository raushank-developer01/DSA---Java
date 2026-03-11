package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void stepsToMoveDisk(int n, String source, String helper, String destination){
        if(n == 1){
            System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
            return;
        }

        stepsToMoveDisk(n - 1, source, destination, helper);
        System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
        

        stepsToMoveDisk(n - 1, helper, source, destination);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Disk: ");
        int disk = sc.nextInt();
        String rod1 = "A";
        String rod2 = "B";
        String rod3 = "C";

        stepsToMoveDisk(disk, rod1, rod2, rod3);
        sc.close();
    }
}
