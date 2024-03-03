package datetime01;

import java.time.LocalDate;
import java.time.Month;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now(); // LocalDate.now(); statikdir , chunki class ismi ile chagirildi
        System.out.println(myDate);
        System.out.println(" nechenci aydir?  "+ myDate.getMonthValue());
        Month hansiAy = myDate.getMonth();
        System.out.println(hansiAy);
        System.out.println(myDate.getYear());

        LocalDate newDate = myDate.plusYears(4).plusMonths(5).plusDays(6);
        System.out.println(newDate);

        System.out.println(myDate.minusYears(3).minusMonths(8).minusDays(11));


    }
}
