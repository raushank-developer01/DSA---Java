package Patterns;

import java.util.Scanner;

public class PalindromicPyramid {
    public static void printPalindromicPyramid(int height){
        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= height - i; j++){
                System.out.print("  ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the pyramid");
        int height = sc.nextInt();

        printPalindromicPyramid(height);
        sc.close();
    }
}
