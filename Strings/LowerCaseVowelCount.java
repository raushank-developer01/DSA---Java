package Strings;

import java.util.Scanner;

public class LowerCaseVowelCount {
    public static int countVowel(String st){
        int count = 0;
        for(int i = 0; i < st.length(); i++){
            if(st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to count no of vowels in it");
        String st = sc.nextLine();

        System.out.println("The no of vowels in the given string are:- " + countVowel(st));
        sc.close();
    }
}
