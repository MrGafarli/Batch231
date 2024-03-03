package d9_string_loops;

import testklasi.Student;

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

//        Student Farid = new Student();
//        Farid.stdName = "Namiq";
//        System.out.println(Farid.stdName);
//Student.stdName = "Michael";
//        System.out.println(Student.stdName);

    }
}
