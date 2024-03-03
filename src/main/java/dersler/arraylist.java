package dersler;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        // Integer arraylist yaradin ve tek olanlari 11 ile evez edin
        ArrayList<Integer> list = new ArrayList<>();
        list.add(19);
        list.add(21);
        list.add(25);
        list.add(28);
        list.add(32);
        list.add(43);
        list.add(97);
        list.add(100);
        System.out.println(list); //[19, 21, 25, 28, 32, 43, 97, 100]
         
    }
}
