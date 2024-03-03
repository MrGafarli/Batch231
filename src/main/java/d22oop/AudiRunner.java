package d22oop;

public class AudiRunner {
    public static void main(String[] args) {
        //Motor motor = new Motor(); interface-den obyekt olushturmaq olmur
        AudiA4 a4 = new AudiA4();
        a4.abs();
        a4.analog();
        a4.digital();
        a4.eco();
        a4.gas();
    }
}
