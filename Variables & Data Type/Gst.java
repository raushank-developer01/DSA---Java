import java.util.Scanner;

public class Gst{

    public static float getgrandtotal(float total){
        return total + total*0.18f;
    }
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the price of pencil: ");
        float pencil = obj.nextFloat();

        System.out.println("Enter the price of pen: ");
        float pen = obj.nextFloat();

        System.out.println("Enter the price of eraser: ");
        float eraser = obj.nextFloat();

        float total = pencil + pen + eraser;

        System.out.println("The total price of pencil, pen & eraser (Without gst) :- " + total);
        System.out.println("With gst:- " + getgrandtotal(total));
        
        obj.close();
    }
}
