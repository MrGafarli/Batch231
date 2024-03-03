package tekrarlar_qarishiq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist999 {
    public static void main(String[] args) {
        List<Integer> list5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 55);
        System.out.println(list5);

        System.out.println("numma() = " + numma(34,34));
        int t = carpTopla(50,49,100);
        System.out.println(t);
    }

    public static int numma(int a, int b) {
        return a + b;
    }

    public static int carpTopla(int q, int d, int z){
        int x = q+d;
        System.out.println("x = " + x);
        if (x>=100){
            int m = x*z;
            return m;

        }else {
            return x;
        }
    }



}
