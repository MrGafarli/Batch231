package tekrarlar_qarishiq;

import java.util.Arrays;

public class Arraylar08 {
    public static void main(String[] args) {
        String s = "Java is easy. Learn Java and earn money!";
        System.out.println(s);
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("words.length = " + words.length);
    }

}
