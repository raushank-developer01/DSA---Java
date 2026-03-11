package Patterns;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void printPyramid(int height){
        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= height - i; j++){
              System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height of pyramid");
        int height = sc.nextInt();

        printPyramid(height);
        sc.close();
    }
}
