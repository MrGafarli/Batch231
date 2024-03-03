package arrays_arraylist;

import java.util.ArrayList;

public class arraylist04 {
    public static void main(String[] args) {
        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        System.out.println(r); //[Manisa, Nigde, Tokat, Van]

        /*for (String w : r){
            if (w.contains("a")){
                r.remove(w);
            }
        }
        System.out.println(r);*/

        for (int i = 0; i < r.size(); i++) {
            if (r.get(i).contains("a")){
                r.remove(i);
                i--;
            }
            
        }
        System.out.println(r);
    }
}
