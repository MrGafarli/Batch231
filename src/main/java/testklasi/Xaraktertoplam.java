package testklasi;

import java.util.Scanner;

public class Xaraktertoplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Adi yazin:     ");
        String name1 = input.nextLine();
        System.out.print("Adi yazin:     ");
        String name2 = input.nextLine();
        System.out.print("Adi yazin:     ");
        String name3 = input.nextLine();


        int name1say = name1.replaceAll("[^A-Za-z]","").length();
        int name2say = name2.replaceAll("[^A-Za-z]","").length();
        int name3say = name3.replaceAll("[^A-Za-z]","").length();

        System.out.println(name1say+"\n"+name2say+"\n"+name3say);


        String str = "  Gafarli Farid   ";
        str=str.trim();
        System.out.println(str.charAt(str.length() - 1));


    }
}
