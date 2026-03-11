import java.util.Scanner;

public class UpperToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Capital Letter");
        char ch = sc.next().charAt(0);

        System.out.println("The small letter of " + ch + " is: " + (char) (ch | ' '));
        sc.close();
    }
}
