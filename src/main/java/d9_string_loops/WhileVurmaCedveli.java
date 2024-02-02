package d9_string_loops;

import java.util.Scanner;

public class WhileVurmaCedveli {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Reqemi daxil edin: ");
        byte num = input.nextByte();
        int i = 1;
        while (i < 11) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }
    }
}
