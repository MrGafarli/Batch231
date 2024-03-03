package tekrarlar_qarishiq;

import java.util.ArrayList;

public class MinFark {
    public static void main(String[] args) {
        ArrayList<Integer> nmbrs = new ArrayList<>();
        nmbrs.add(44);
        nmbrs.add(16);
        nmbrs.add(78);
        nmbrs.add(90);
        nmbrs.add(54);
        nmbrs.add(39);
        nmbrs.add(22);
        nmbrs.add(19);
        nmbrs.add(1);
        nmbrs.add(94);
        nmbrs.add(97);
        System.out.println(nmbrs);
        nmbrs.sort(null);
        System.out.println(nmbrs);
        int minFark = nmbrs.get(1) - nmbrs.get(0);
        for (int i = 1; i <nmbrs.size() ; i++) {
            minFark = Math.min(minFark, nmbrs.get(i) - nmbrs.get(i-1));
        }
        System.out.println(minFark);

        for (int i = 1; i <nmbrs.size() ; i++) {
            if (nmbrs.get(i) - nmbrs.get(i-1)==minFark){
                System.out.println(nmbrs.get(i) + " ve " + nmbrs.get(i-1));
            }
        }
    }
}
