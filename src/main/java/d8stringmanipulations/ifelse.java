package d8stringmanipulations;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type , which day is today? ");
        String gunismi = input.next();
        if (gunismi.equalsIgnoreCase("Saturday") || gunismi.equalsIgnoreCase("Sunday")) {
            System.out.println(" - Weekend");
        } else if (gunismi.equalsIgnoreCase("Monday")
                || gunismi.equalsIgnoreCase("Tuesday")
                || gunismi.equalsIgnoreCase("Wednesday")
                || gunismi.equalsIgnoreCase("Thursday")
                || gunismi.equalsIgnoreCase("Friday"))
        {
            System.out.println(" - Weekday");
        }else {
            System.out.println("You should select true day! ");
        }
    }
}