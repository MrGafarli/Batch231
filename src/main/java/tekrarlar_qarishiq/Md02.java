package tekrarlar_qarishiq;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {
        String[][] students01 = { {"Kamal", "Ramal"}, {"Camal"},
                                  {"Amal", "Dumal", "Nimal"},
                                  {"Sadiq", "Irfan", "Sultan"} };
        System.out.println(Arrays.deepToString(students01));

        int toplam = 0;
        for (String[] w : students01){
            toplam+=w.length;
        }
        System.out.println("students01 arrayinin ichindeki eleman sayi: "+toplam);


        //Yuxaridaki strings01 arrayinda olan adlardan ichinde i herfi olanlari yazdiraq!
        for (String[] k : students01){
           for (String x : k){
               if (x.contains("i")){
                   System.out.print(x+ " ");
               }
           }
        }
    }
}
