package d23oop_collections;

public class AudiRunner {
    public static void main(String[] args) {
        //Motor motor = new Motor(); interface-den obyekt olushturmaq olmur
        AudiA4 a4 = new AudiA4();
        a4.abs();
        a4.analog();
        a4.digital();
        a4.eco();
        a4.gas();
        a4.esp();
        //a4.run();
        /*run metodunun hansi interfaceden geldiyi bilmirik
         buna gore ozumuz interface sechib chagiraq */
        ((Fren)a4).run();
        System.out.println("Motor.fiyat = " + Motor.fiyat);
        //final oldugu uchun burda deyeri deyishe bilmerik
        System.out.println("Klima.fiyat = " + Klima.fiyat);
        System.out.println("Fren.fiyat = " + Fren.fiyat);

        Fren.hiz();
        a4.guc();



    }
}
