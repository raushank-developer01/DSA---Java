package ArrayLists;

import java.util.ArrayList;

public class BeautifulArrayList {
    // Iterative 
    public static ArrayList<Integer> beautifulArray(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        for(int i = 2; i <= n; i++){
            ArrayList<Integer> temp = new ArrayList<>();

            for(Integer e : ans){
                if(2*e - 1 <= n)temp.add(e*2 - 1);
            }

            for(Integer e : ans){
                if(2*e  <= n) temp.add(e*2);
            }

            ans = temp;
        }

        return ans;
    }

    // Divide and Conquer

    // public static ArrayList<Integer> beautifulArray(int n){
    //     ArrayList<Integer> res = new ArrayList<>();

    //     divideConquer(1, 1, res, n);

    //     return res;
    // }

    // private static void divideConquer(int start, int increment, ArrayList<Integer> res, int n){
    //     if(start + increment > n){
    //         res.add(start);
    //         return;
    //     }

    //     divideConquer(start, 2 * increment, res, n);
    //     divideConquer(start + increment, 2 * increment, res, n);
    // }
    public static void main(String[] args) {
        int n = 5;
        System.out.print(beautifulArray(n));
    }
}
