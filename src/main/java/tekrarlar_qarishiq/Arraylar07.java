package tekrarlar_qarishiq;

import java.util.Arrays;

public class Arraylar07 {
    public static void main(String[] args) {
        //binarysearch
        //binarysearch elemek uchun bize sort() metodu lazimdi

        String[] alphabets = {"Q","A","X","B","Y","T","Z","N","F","G","R","C",};
        System.out.println(Arrays.toString(alphabets));
        Arrays.sort(alphabets);
        System.out.println(Arrays.toString(alphabets));
        int x = Arrays.binarySearch(alphabets,"X");
        System.out.println(x);

    }
}
