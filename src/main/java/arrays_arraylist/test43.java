package arrays_arraylist;

import java.util.ArrayList;
import java.util.List;

public class test43 {
    public static void main(String[] args) {
        String s = "Gafarli";
        for (int i = s.length()-1; i>=0; i--){
            String c = s.substring(i,i+1);

            if (s.indexOf(c) == s.lastIndexOf(c)){
                System.out.print(c);
                //System.out.print(x);
            }
        }





    }
    }



