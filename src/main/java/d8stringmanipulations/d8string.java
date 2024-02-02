package d8stringmanipulations;

import java.util.Scanner;

public class d8string {
    public static void main(String[] args) {

        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

        Scanner scan = new Scanner(System.in);
        System.out.println("Type your Password please: ");
        String pwd = scan.nextLine();
        boolean lengthControl = pwd.length()>7;
        System.out.println("lengthControl = " + lengthControl);

       boolean spaceControl =  pwd.replaceAll("[^ ]", "").length()==0;
        System.out.println("spaceControl = " + spaceControl);

        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length()>0;
        System.out.println("upperCaseControl = " + upperCaseControl);

        boolean lowerCaseControl = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println("lowerCaseControl = " + lowerCaseControl);

        boolean digitControl = pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println("digitControl = " + digitControl);

        boolean isValid = lengthControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl;

        if (isValid) {
            System.out.println("Shifre gecerli");
        }else {
            System.out.println("pass gecersiz");
        }

    }
}
