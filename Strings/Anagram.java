package Strings;

import java.util.Scanner;

public class Anagram {
    public static boolean checkAnagram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() != str2.length()){
            return false;
        }

        int freq[] = new int[26];

        for(int i = 0; i < str1.length(); i++){
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        for(int i : freq){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string 1 ");
        String str1 = sc.nextLine();

        System.out.println("Enter the string 2 ");
        String str2 = sc.nextLine();

        System.out.println(checkAnagram(str1, str2));
        sc.close();
    }
}
