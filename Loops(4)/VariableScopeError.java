package Loops;

public class VariableScopeError {
    public static void main(String[] args) {
        int i; // declare out side

        for(i = 0; i <= 5; i++) { // don't declare inside this block
            System.out.println("i = " + i);
        }

        System.out.println("i after the loop = " + i);
    }
}
