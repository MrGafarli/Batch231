package datetime01;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate girilenTarih = null;

        while (true){
            System.out.println("PLease type the year! ");
            int year = input.nextInt();
            System.out.println("PLease type the month! (1-12) ");
            int month = input.nextInt();
            if (month<1 || month > 12){
                System.out.println("The month which you entered, it has to be between 1 and 12. Please, try again! ");
                continue; // user will go back to loop starting
            }


            System.out.println("PLease type the day! ");
            int day = input.nextInt();
            YearMonth yearMonth = YearMonth.of(year,month);
            int daysInMonth = yearMonth.lengthOfMonth();
            if (day<1 || day > daysInMonth){
                System.out.println("Not acceptable, Try again");
                continue;
            }
            girilenTarih = LocalDate.of(year,month,day);
            if (girilenTarih.isBefore(LocalDate.now())){
                System.out.println("Gechersiz (kecmish)tarih girdiz tekrar deneyin");
            }else {
                System.out.println("Zamani gire bilersiniz! ");
                break;
            }



        }





    }

}
