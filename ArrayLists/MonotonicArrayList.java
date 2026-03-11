package ArrayLists;
import java.util.ArrayList;
public class MonotonicArrayList {
    public static boolean isMonotonic(ArrayList<Integer> list){
        boolean inc = true;
        boolean dec = true;

        for(int i = 1; i < list.size() - 1; i++){
            if(list.get(i - 1) > list.get(i)) inc = false;
            if(list.get(i - 1) < list.get(i)) dec = false;
        }

        return inc || dec ;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);

    System.out.println(isMonotonic(list));

    }
}
