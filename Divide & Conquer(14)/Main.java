public class Main
{
    public static int bSearch(int[] arr,int target, int lo, int hi){
        if(lo > hi) return -1;
        
        int mid = lo + (hi - lo)/2;
        
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] < target){
            return bSearch(arr, target, mid + 1, hi);
        }else{
            return bSearch(arr, target, lo, mid);
        }
    }
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int target = 5;
		int lo = 0;
		int hi = arr.length - 1;
		
		System.out.println(bSearch(arr, target, lo, hi));
	}
}