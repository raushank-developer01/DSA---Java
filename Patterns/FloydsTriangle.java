package Patterns;

import java.util.Scanner;

public class FloydsTriangle {
    public static void printFloydTriangle(int height){
        int k = 1;
        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the breadth of the triagle");
        int height = sc.nextInt();

        printFloydTriangle(height);
        sc.close();
    }
}
