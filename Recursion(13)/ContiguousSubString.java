package Recursion;

import java.util.Scanner;

public class ContiguousSubString {
    public static int countSubstring(String str, int i, int j){
        if(i == str.length()){
            return 0;
        }
        if(j == str.length()){
            return countSubstring(str, i + 1, i + 1);
        }

        int count = 0;
        if(str.charAt(i) == str.charAt(j)) count = 1;

        return countSubstring(str, i, j + 1) + count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:- ");
        String str = sc.next();

        System.out.println(countSubstring(str, 0, 0));
        sc.close();
    }
}
