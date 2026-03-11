package Recursion;

import java.util.Scanner;

public class LengthOfString {
    public static int countLength(String str){
        if(str.length() == 0){
            return 0;
        }
        return countLength(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();

        System.out.println(countLength(str));
        sc.close();   
    }
}
