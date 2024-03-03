package tekrarlar_qarishiq;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        int[][] a = {{19,32},{98,54},{76,49}};
        System.out.println(Arrays.deepToString(a));//Butun array-i yazir
        System.out.println(a[1][1]);//1 elemani yazir
        System.out.println(Arrays.toString(a[2]));//1ci arrayin bir cut elemanini yazdirir
    }
}
