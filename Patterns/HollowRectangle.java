package Patterns;
import java.util.*;

public class HollowRectangle {

    public static void printHollowRectangle(int length, int breadth){
        for(int i = 1; i <= breadth; i++){
            for(int j = 1; j <= length; j++){
                if(i == 1 || i == breadth || j == 1 || j == length){
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
        System.out.println("Enter Length of Rectangle");
        int length = sc.nextInt();

        System.out.println("Enter Breadth of the Rectangle");
        int breadth = sc.nextInt();
    
        printHollowRectangle(length, breadth);
        sc.close();
    }
}
