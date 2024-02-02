package d8stringmanipulations;

import java.util.Scanner;

public class Ders1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String gunismi = input.next();
        if (gunismi.equalsIgnoreCase("Saturday") || gunismi.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend");
        } else if (gunismi.equalsIgnoreCase("Monday")
                || gunismi.equalsIgnoreCase("Tuesday")
                || gunismi.equalsIgnoreCase("Wednesday")
                || gunismi.equalsIgnoreCase("Thursday")
                || gunismi.equalsIgnoreCase("Friday"))
        {
            System.out.println("Weekday");
        }else {
            System.out.println("You should select true day! ");
        }
    }
}
