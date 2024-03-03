package tekrarlar_qarishiq;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TekTekrarsiz {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('J');
        list.add('a');
        list.add('v');
        list.add('a');
        list.add('v');
        System.out.println(list);
        List<Character> list2 = new ArrayList<>();
        for (Character w: list){
            if (!list2.contains(w)){
                list2.add(w);
            }
        }
        System.out.println(list2);
    }
}
