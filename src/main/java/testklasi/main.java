package testklasi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sozu daxil edin ");
        String soz = input.nextLine();
        for (int i = 0; i < soz.length(); i++) {
            if (soz.length()>10){
                char chsoz = soz.charAt(i);
                System.out.print(chsoz);

            }
        }
        System.out.println();
        String subs = soz.substring(6);
        System.out.println(subs);

    }
}
