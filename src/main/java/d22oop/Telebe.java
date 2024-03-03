package d22oop;

public class Telebe {
    public String name = "Farid Gafarli";
    private int age = 32;
    private boolean successfull = true;

    //age ve successfull deyishenlerini getter ile chixaraq

    public int getAge() {
        return age;
    }

    public boolean isSuccessfull() {
        return successfull;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSuccessfull(boolean successfull) {
        this.successfull = successfull;
    }
}
