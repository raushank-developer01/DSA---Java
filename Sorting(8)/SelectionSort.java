package Sorting;

import java.util.Arrays;
import java.util.Scanner;

class SelectionSort {
    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int minPosition = i;
            for(int j = i + 1; j < n; j++){
                if(arr[minPosition] > arr[j]){
                    minPosition = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = temp;
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

        System.out.println(Arrays.toString(selectionSort(arr)));
        sc.close();
    }
}