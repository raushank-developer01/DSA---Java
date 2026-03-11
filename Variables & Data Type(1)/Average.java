import java.util.Scanner;

public class Average{

    public static float getAverage(int a, int b, int c){
        return (a+b+c)/3.0f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a");
        int a = sc.nextInt();

        System.out.println("Enter b");
        int b = sc.nextInt();
                
        System.out.println("Enter c");
        int c = sc.nextInt();

        sc.close();

        System.out.println("The average of given"+a+" "+b+" "+c+"is: "+getAverage(a, b, c));
    }
}
