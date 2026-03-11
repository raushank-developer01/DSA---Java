public class StringSort {
    public static void merge(String[] arr, int si, int mid, int ei){
        String[] temp = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if(arr[i].compareTo(arr[j]) < 0){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }

        while (j <= ei) {
            temp[k] = arr[j];
            k++;
            j++;
        }
        for(k = 0, i = si; k < temp.length; i++, k++){
            arr[i] = temp[k];
        }
    }

    public static void mergeSort(String[] arr, int si, int ei){
        if(si >= ei){
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid); 
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        String[] arr = {"sun", "mars", "earth", "mercury"};
        int end = arr.length - 1;
        mergeSort(arr, 0, end);

        for(String s : arr){
            System.out.print(s + " ");
        }
    }
}
