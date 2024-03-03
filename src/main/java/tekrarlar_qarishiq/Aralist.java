package tekrarlar_qarishiq;

import java.util.ArrayList;

public class Aralist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ferid");
        list.add("Gunesh");
        list.add("Posu");
        list.add("Nazim");
        list.add("Kazim");
        list.add("Razim");
        System.out.println(list);
        /*for (String w:list){
            if (w.contains("a")){
                list.remove(w);
            }
        }
        System.out.println(list);*/ //xeta

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("a")){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
