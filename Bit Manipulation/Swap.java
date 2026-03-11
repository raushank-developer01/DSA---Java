import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X:- ");
        int x = sc.nextInt();

        System.out.println("Enter the value of Y:- ");
        int y = sc.nextInt();

        System.out.println("Before Swap X:- " + x);
        System.out.println("Before Swap Y:- " + y);

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("After Swap X:- " + x);
        System.out.println("After Swap Y:- " + y);
        sc.close();   
    }
}
