package arrays_arraylist;

import java.util.ArrayList;

public class arraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(9);
        ages.add(12);
        ages.add(43);
        ages.add(54);
        ages.add(1,7);
        ages.add(65);
        System.out.println(ages);
    }
}
