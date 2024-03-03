package tekrarlar_qarishiq;

import java.util.Arrays;

public class IkiBoyutuTekBoyuta {
    public static void main(String[] args) {
        int[][] numos= {{5,4},{2,3,2}};
        System.out.println(Arrays.deepToString(numos));//[[5, 4], [2, 3, 2]]
        int toplam = 0;


        for (int[] w:numos){
            toplam+=w.length;
        }
        System.out.println(toplam);
        int[] numos2 = new int[toplam];
        System.out.println(Arrays.toString(numos2));

        int ilkindexx = 0;
        for (int[] w : numos){
            for (int k : w){
                numos2[ilkindexx] = k;
                ilkindexx++;
            }
        }
        System.out.println(Arrays.toString(numos2));
    }
}
