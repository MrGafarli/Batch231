package testklasi;

import java.text.DateFormat;

public class string_builder01 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("netleshdirebildiklerimizdensinizmi?");


        sb1.insert(35, "hiy?");
        System.out.println(sb1);
        String sb2 = sb1.toString().toUpperCase();
        System.out.println("sb2 = " + sb2);
        StringBuilder sb3 = new StringBuilder(sb2);
        sb3.replace(35, 40, "miyy?");
        System.out.println("sb3 = " + sb3);
    }
}
