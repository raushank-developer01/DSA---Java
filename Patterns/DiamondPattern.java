package Patterns;

import java.util.Scanner;

public class DiamondPattern {
    public static void printDiamond(int side){
        for(int i = 1; i <= side; i++){
            for(int j = 1; j <= side - i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        for(int i = side; i >= 1; i--){
            for(int j = 1; j <= side - i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of diamond");
        int side = sc.nextInt();

        printDiamond(side);
        sc.close();
    }
}
