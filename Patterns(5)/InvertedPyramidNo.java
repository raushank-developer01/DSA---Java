package Patterns;

import java.util.Scanner;

public class InvertedPyramidNo {
    public static void printNoPyramid(int height){
        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= height - i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height of the Pyramid");
        int height = sc.nextInt();

        printNoPyramid(height);
        sc.close();
    }
}
