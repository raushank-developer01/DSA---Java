package Patterns;

import java.util.Scanner;

public class ButterflyPattern {
    public static void printButterfly(int size){
        for(int i = 1; i <= size/2; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = i + 1; j <= size - i; j++){
                System.out.print("  ");
            }
            for(int j = size - i + 1; j <= size; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = size/2; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = i + 1; j <= size - i; j++){
                System.out.print("  ");
            }
            for(int j = size - i + 1; j <= size; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of butterfly");
        int size = sc.nextInt();

        printButterfly(size);
        sc.close();
    }
}
