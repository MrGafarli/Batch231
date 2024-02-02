package arrays_arraylist;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz. Interview Sorusu
        //         [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]

        int[] arr = {0, 2, 3, 0, 12, 0};
        int[] yeniArr = new int[arr.length];
        int ilkIndex = 0;
        for (int w: arr){
            if (w!=0){
                yeniArr[ilkIndex] = w;
                ilkIndex++;
            }
        }
        System.out.println(Arrays.toString(yeniArr));

    }
}
