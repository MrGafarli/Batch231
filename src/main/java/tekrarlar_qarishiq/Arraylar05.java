package tekrarlar_qarishiq;

import java.util.Arrays;

public class Arraylar05 {
    public static void main(String[] args) {
        //Arrayda verilen elemanlardan en kichikle en boyuyu topla
        //1ci yol
        int[] ages = new int[]{47,89,63,15,198,94};
        System.out.println(Arrays.toString(ages));
        int smallest = ages[0];
        int largest = ages[0];
        int sum = 0;

        for(int w : ages){

            if (w<smallest){
                smallest=w;
            }
            if (w>largest){
                largest=w;
            }
            sum = largest+smallest;
        }
        System.out.println("smallest = " + smallest);
        System.out.println("largest = " + largest);
        System.out.println("sum = " + sum);

        System.out.println("-----------------------------------------");
        //---------------------------------------------------------------
        //2ci yol
        //Arrayi siralayiriq ilk once
        //sort() metodu saylari kicikden boyuye siralayir (ascending order)
        //String data tiplerini de alfabetik olaraq siralaya bilir bu metod (alphabetical order)
        //ascending order + alphabetical order = natural order

       /* Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        System.out.println(ages[0]+ages[ages.length-1]);*/

        //--------------------------------------------
         int minm = ages[0];
         int maxm = ages.length-1;
         for (int w : ages){
             minm = Math.min(minm,w);
             maxm = Math.max(maxm,w);
         }
        System.out.println("minm = " + minm);
        System.out.println("maxm = " + maxm);
        System.out.println("toplam : "+ (minm + maxm));
    }
}
