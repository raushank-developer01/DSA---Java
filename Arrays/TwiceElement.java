package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class TwiceElement {
    public static boolean containsTwice(int[] arr){
        Arrays.sort(arr);
        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] == arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = sc.nextInt();
        int arr[] = new int[length];

        for(int i = 0; i < length; i++){
            System.out.println("Enter the " + i +"th element");
            arr[i] = sc.nextInt();
        }

        System.out.println(containsTwice(arr));
        sc.close();
    }
}
