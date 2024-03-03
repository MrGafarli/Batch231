package d8stringmanipulations;

import java.util.Scanner;

public class Ders1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dayName = input.next();
        if (dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend");
        } else if (dayName.equalsIgnoreCase("Monday")
                || dayName.equalsIgnoreCase("Tuesday")
                || dayName.equalsIgnoreCase("Wednesday")
                || dayName.equalsIgnoreCase("Thursday")
                || dayName.equalsIgnoreCase("Friday"))
        {
            System.out.println("Weekday");
        }else {
            System.out.println("You should select true day! ");
        }
    }
}
