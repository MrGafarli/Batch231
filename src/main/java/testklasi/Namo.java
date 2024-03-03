package testklasi;

import java.util.Scanner;

public class Namo {
    public static void main(String[] args) {
        /*String s = "Bakidan Zaqatalaya 560 km mesafe var";
        int num = s.length();
        String ss = s.replaceAll("[^A-Za-z]", "*");
        System.out.println(num);
        System.out.println(ss);*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String pwd = input.nextLine();

        //i)En az 8 karakter olsun
        boolean lengthControl = pwd.length() > 7;
        System.out.println("lengthControl = " + lengthControl);

        //ii)Space karakteri password'de olmasin
        //space haric herseyi silelim, 0 tane mi diye bakalim

        boolean spaceControl = pwd.replaceAll("[^ ]", "").isEmpty(); //length()==0'de yazabilirdik
        System.out.println("spaceControl = " + spaceControl);

        //iii)En az bir tane buyuk harf olsun(buyuk harf haric herseyi silelim)

        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("upperCaseControl = " + upperCaseControl);

        //iv)En az bir tane kucuk harf olsun

        boolean lowerCaseControl = pwd.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("lowerCaseControl = " + lowerCaseControl);

        //v)En az bir tane rakam olsun
        boolean digitControl = pwd.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("digitControl = " + digitControl);

        if (!digitControl){
            System.out.println("Sifre an az bir rakam icermelidir");
        }

        boolean isValid = lengthControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl;

        if (isValid){
            System.out.println("Sifre gecerlidir");
        }else {
            System.out.println("Sifre gecersizdir");
        }
    }
}
