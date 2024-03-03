package datetime01;

import java.nio.file.LinkPermission;
import java.time.LocalDate;
import java.util.Scanner;

public class DogumGunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        LocalDate date = LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek());
    }

}
