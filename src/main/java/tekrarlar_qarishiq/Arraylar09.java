package tekrarlar_qarishiq;

import java.util.Arrays;

public class Arraylar09 {
    public static void main(String[] args) {
    /*    [0, 2, 3, 0, 12, 0]
        [0, 0, 0, 0, 0, 0]
        [2, 3, 12, 0, 0, 0]*/

        int[] numbers1 = {0,2,3,0,12,0};
        int[] numbers2 = new int[numbers1.length];
        int ilkIndex = 0;
        for (int w : numbers1){
            if (w!=0){
                numbers2[ilkIndex] = w;
                ilkIndex++;
            }

        }
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(numbers1));
    }
}
