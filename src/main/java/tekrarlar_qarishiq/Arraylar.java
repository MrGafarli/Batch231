package tekrarlar_qarishiq;

import java.util.Arrays;

public class Arraylar {
    public static void main(String[] args) {
        String[] arr = new String[]{"Farid","Gunash","Gunay","Gunel","Samire","Nazim"};
        System.out.println(Arrays.toString(arr)); //[Farid, Gunash, Gunay, Gunel, Samire, Nazim]
        int totalChar = 0;
        for (int i = 0; i < arr.length; i++) {
            totalChar += arr[i].length();
        }
        System.out.println(totalChar);
        System.out.println("----------------------------");

        int sum = 0;
        for (String w : arr){
            sum+=w.length();
        }
        System.out.println(sum);
    }
}
