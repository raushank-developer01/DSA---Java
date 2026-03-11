package Arrays;

import java.util.Scanner;

public class SortedAndRotatedArray {
    public static int containsTarget(int arr[], int target){
        int start = 0; 
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target) return mid;

            if(arr[start] <= arr[mid]){
                if(arr[start] <= target && target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(arr[mid] < target && target <= arr[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the sorted and rotated element");
        int length = sc.nextInt();
        int arr[] = new int[length];

        for(int i = 0; i < length; i++){
            System.out.println("Enter the " + i + "th element");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target Element");
        int target = sc.nextInt();

        System.out.println(containsTarget(arr, target));
        sc.close();
    }
}
