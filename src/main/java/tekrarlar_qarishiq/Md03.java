package tekrarlar_qarishiq;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {
        int[][] noms = {{3,4},{7,8,9}};
        int toplamElemanSayisi = 0;

        for (int[] w : noms){
            toplamElemanSayisi+=w.length;

        }
        System.out.println(toplamElemanSayisi);
        int[] newArr99 = new int[toplamElemanSayisi];
        System.out.println(Arrays.toString(newArr99));
        int idx = 0;
        for (int[] w: noms){
            for (int k: w){
                newArr99[idx] = k;
                idx++;

                }


            }
        System.out.println(Arrays.toString(newArr99));
        }
        

    }

