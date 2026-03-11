import java.util.Scanner;

public class PalindromeNo {
    public static void isPalindrome(int num){
        int n = num;
        int no = 0;

        while (n != 0) {
            int rem = n % 10;
            no = (no * 10) + rem;
            n /= 10;
        }
        if(no == num){
            System.out.println("Yes the given no is palindrome");
        }else{
            System.out.println("No the no is not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check palindrome");
        int num = sc.nextInt();

        isPalindrome(num);
        sc.close();
    }
}
