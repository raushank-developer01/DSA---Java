package Patterns;

import java.util.Scanner;

public class NumberPyramid {
    public static void printNumberPyramid(int height){
        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= height - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid");
        int height = sc.nextInt();

        printNumberPyramid(height);
        sc.close();
    }
}
