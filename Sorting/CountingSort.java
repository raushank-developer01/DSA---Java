package Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class CountingSort {
    public static int[] countingSort(int[] arr){
        int n = arr.length;
        int maxElement = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            maxElement = Math.max(maxElement, arr[i]);
        }

        int[] freq = new int[maxElement + 1];
        for(int i = 0; i < n; i ++){
            freq[arr[i]]++;
        }

        int j = 0;
        for(int i = 0; i < freq.length; i++){
            while(freq[i] > 0){
                arr[j++] = i;
                freq[i]--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = sc.nextInt();
        int[] arr = new int[length];

        for(int i = 0; i < length; i++){
            System.out.println("Enter the " + i + "th element");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(countingSort(arr)));

        sc.close();
    }
}
