package d9_string_loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        String t = "Ghara";
        String unique = "";
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (t.indexOf(ch) == t.lastIndexOf(ch)){
                unique += ch;
            }
        }
        System.out.println(unique);
        }
    }


