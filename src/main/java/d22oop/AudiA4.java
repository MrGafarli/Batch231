package d22oop;

public class AudiA4 implements Motor,Klima,Fren {
    @Override
    public void eco() {
        System.out.println("Audi A4 eco motor kullanir");
    }

    @Override
    public void turbo() {
        System.out.println("Audi A4 turbo motor kullanir");

    }

    @Override
    public void gas() {
        System.out.println("Audi A4 gas motor kullanir");

    }
    @Override
    public void analog() {
        System.out.println("Audi A4 analog klima kullanir");

    }

    @Override
    public void digital() {
        System.out.println("Audi A4 digital klima kullanir");

    }
    @Override
    public void abs() {
        System.out.println("Audi A4 abs fren kullanir");

    }

    @Override
    public void esp() {
        System.out.println("Audi A4 esp fren kullanir");

    }


    public void run() {
        System.out.println("Audi A4 havayastigini chalishdir!");
    }
}
