package testklasi;

public class StrManu {
    public static void main(String[] args) {
        String a = "abc@gmail.com";
        String b = a.split("\\.")[0];
        System.out.println(b);
        String c = b.split("\\@")[1];
        System.out.println(c);

    }
}
