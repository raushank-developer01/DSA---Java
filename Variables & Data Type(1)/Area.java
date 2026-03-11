import java.util.Scanner;

public class Area {

    public static float area(float side){
        return side*side;
    }
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter side of square");
    float side = sc.nextFloat();

    sc.close();

    System.out.println("The area of square is: "+area(side));

}
}