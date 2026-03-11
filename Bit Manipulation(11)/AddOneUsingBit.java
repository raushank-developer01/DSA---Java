import java.util.Scanner;
public class AddOneUsingBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        System.out.println("The number after increasing 1 is: " + -(~num));
        sc.close();
    }
}
