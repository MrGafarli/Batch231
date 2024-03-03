package tekrarlar_qarishiq;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class YeneTekrar {
    public static void main(String[] args) {
String[][] isimler = {{"Namiq","Kamal"},{"Azer","Ilham","Emin"},{"Elnur", "Elshen","Cavid","Malik"}};
        System.out.println("isimler = " + Arrays.deepToString(isimler));

        for (String[] w : isimler){
            for (String k : w){
                if (k.toLowerCase().contains("m")){
                    System.out.print(k+" ");
                }
            }
        }
    }
}
