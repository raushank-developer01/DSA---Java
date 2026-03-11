package Recursion;

public class PrintIndices {
    public static void printIndex(int[] arr, int key, int index){
        if(index == arr.length) return;
        if(arr[index] == key){
            System.out.print(index + " ");
        }

        printIndex(arr, key, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 6, 5, 4, 2, 7, 2, 2};
        int key = 2;
        int index = 0;

        printIndex(arr, key, index);
    }
}
