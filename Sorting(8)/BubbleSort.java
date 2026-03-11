package Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = 1; j < n - i; j++){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++){
            System.out.println("Enter the " + i + "th element");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(bubbleSort(arr)));
        sc.close();
    }
}
