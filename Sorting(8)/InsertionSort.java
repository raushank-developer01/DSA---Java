package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
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

        System.out.println(Arrays.toString(insertionSort(arr)));
        sc.close(); 
    }
}
