package tekrarlar_qarishiq;

import java.util.ArrayList;

public class Uop {
    public static void main(String[] args) {
        ArrayList<Integer> tekCut = new ArrayList<>();
        tekCut.add(41);
        tekCut.add(16);
        tekCut.add(42);
        tekCut.add(69);
        tekCut.add(31);
        tekCut.add(15);

        System.out.println("tekCut = " + tekCut);

        for (Integer w : tekCut){
            if (w%2!=0){
                tekCut.set(tekCut.indexOf(w), 11);
            }


        }
        System.out.println(tekCut);

    }
}
