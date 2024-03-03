package d22oop;

public class HondaRunner {
    public static void main(String[] args) {
        //abstract class-dan obyekt olushturamayiz
        Civic civic = new Civic();
        civic.engine();
        civic.music();
        Accord accord = new Accord();
        accord.engine();
        accord.music();
        AbstractChild absChild = new AbstractChild();
        absChild.engine();
        absChild.music();

    }
}
