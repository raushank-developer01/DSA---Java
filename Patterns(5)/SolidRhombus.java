package Patterns;

import java.util.Scanner;

public class SolidRhombus {
    public static void printSolidRhombus(int side){
        for(int i = 1; i <= side; i++){
            for(int j = 1; j <= side - i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= side; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of rhombus");
        int side = sc.nextInt();

        printSolidRhombus(side);
        sc.close();
    }
}
