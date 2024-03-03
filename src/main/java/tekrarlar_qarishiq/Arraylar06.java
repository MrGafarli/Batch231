package tekrarlar_qarishiq;

import java.util.Arrays;

public class Arraylar06 {
    public static void main(String[] args) {
        int[] arr1 = {52, 56, 84, 5, 3, 12, 99, 1, -3, -9, 96, 14};
        System.out.println(Arrays.toString(arr1));

        for (int w : arr1){
            if (w<5){
                System.out.print(w+" ___  " );
            }
        }
    }
}