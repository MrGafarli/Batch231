package d22oop;

public class TelebeRunner {
    public static void main(String[] args) {
        Telebe t = new Telebe();
        System.out.println("t.name = " + t.name);
        //get
        System.out.println("t.getAge() = " + t.getAge());
        System.out.println("t.isSuccessfull() = " + t.isSuccessfull());

        t.setAge(33);
        System.out.println("t.getAge() = " + t.getAge());
        t.setSuccessfull(false);
        System.out.println("t.isSuccessfull() = " + t.isSuccessfull());
    }
}
