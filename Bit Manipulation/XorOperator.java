import java.util.Scanner;

public class XorOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value of get X ^ X");
        int x = sc.nextInt();

        System.out.println("The value of " + x + " ^ " + x + " is:- " + (x ^ x));
        sc.close();
    }
}
