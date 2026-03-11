package Patterns;

import java.util.Scanner;

public class HollowRhombus{
    public static void printHollowRhombus(int side){
        for(int i = 1; i <= side; i++){
            for(int j = 1; j <= side - i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= side; j++){
                if(i == 1 || i == side || j == 1 || j == side){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the side of rhombus");
     int side = sc.nextInt();

     printHollowRhombus(side);
     sc.close(); 

    }
}
