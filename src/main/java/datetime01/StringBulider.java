package datetime01;

import erisimbelirleyiciler.Student;
enum Gunler {
    Yanvar,Fevral,Mart,Aprel,May;
}
public class StringBulider {
    public static void main(String[] args) {
        /*StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length()); //0
        System.out.println(sb2.capacity());
        sb2.append("Java");
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.length() = " + sb2.length());
        System.out.println("sb2.capacity() = " + sb2.capacity());*/

        Student student = new Student();
        System.out.println(student);
        System.out.println();
        Gunler g = Gunler.Fevral;

        System.out.println(g.ordinal());


    }
}
