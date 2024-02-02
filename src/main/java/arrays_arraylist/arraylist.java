package arrays_arraylist;

import java.util.Arrays;

public class arraylist {
    public static void main(String[] args) {
        String[][] names = new String[][]{{"Samir"}, {"Kamil", "Qalib"}, {"Namiq", "Zamin"}, {"Arif", "Zerif"}};
        for (String[] w : names) {
            for (String k : w) {
                if (k.contains("i")) {
                    System.out.print(k + " ");
                }
            }
        }
    }
}
