import java.util.Scanner;

public class EvenOdd {

    public static boolean isEven(int num){
        return num % 2 == 0 ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to check Odd or Even");
        int num = sc.nextInt();

        System.out.println(isEven(num));
        sc.close();
    }
}
