package d9_string_loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Loops004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sutunu daxil edin: ");
        int sutun = input.nextInt();
        for (int i = 0; i <= sutun; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
