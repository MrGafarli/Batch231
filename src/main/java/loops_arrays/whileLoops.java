package loops_arrays;

public class whileLoops {
    public static void main(String[] args) {
        int k = 413;
        String m = String.valueOf(k); // "414"
        String reversed = "";
        int n = m.length() - 1;
        while (n>=0){
            reversed += m.charAt(n);
            n--;
        }
        System.out.println(reversed);
        if (m.equals(reversed)){
            System.out.println("it is polindrom");
        }else {
            System.out.println("it is not polindrom");
        }
    }
}
