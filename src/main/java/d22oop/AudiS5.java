package d22oop;

public class AudiS5 implements Motor,Klima,Fren {

    @Override
    public void abs() {
        System.out.println("Audi S5 ABS fren kullanir");
    }

    @Override
    public void esp() {
        System.out.println("Audi S5 ESP fren kullanir");

    }

    @Override
    public void analog() {
        System.out.println("Audi S5 analog klima kullanir");

    }

    @Override
    public void digital() {
        System.out.println("Audi S5 digital klima kullanir");

    }

    @Override
    public void eco() {
        System.out.println("Audi S5 eco motor kullanir");

    }

    @Override
    public void turbo() {
        System.out.println("Audi S5 turbo motor kullanir");

    }

    @Override
    public void gas() {
        System.out.println("Audi S5 benzin motor kullanir");

    }
}
