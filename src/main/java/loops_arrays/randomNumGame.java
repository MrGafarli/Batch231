package loops_arrays;

import java.util.Random;
import java.util.Scanner;

public class randomNumGame {
    public static void main(String[] args) {
        //0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz!
        //Scanner ve Random class'larindan object (nesne) uretelim..
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //0-100 arasinda rastgele sayi uretelim
        int rastgeleSayi = random.nextInt(101);

        //Kullanicinin kach kere tahmin yaptigini takip eden bir sayac olushturalim
        int denemeSayisi = 0;

        //Kullaniicinin yaptigi tahminini saklamak uchun bir deyishken olushturalim
        int tahminEdilen;

        //Kullanicinin sayiyi dogru tahmin edib etmedigini kontrol etmek ichin bir boolean uretelim
        boolean tahminDogrumu = false;

        //Oyunun achiklamasini yazdiralim
        System.out.println("0-100 arasinda bir sayi tahmin etmeye chalishin");

        //Dogru tahmin yapilincaya kadar donguyu devam etdirelim

        do {
            //kullanicidan tahmin aliyoruz
            System.out.println("Tahmininizi yazin");
            tahminEdilen = scanner.nextInt();

            //Sayaci artiralim
            denemeSayisi++;

            //Tahmini kontrol edelim
            if (tahminEdilen<rastgeleSayi){
                System.out.println("sayi daha buyuk");
            } else if (tahminEdilen>rastgeleSayi) {
                System.out.println("sayi daha kuchuk");
            }else {
                System.out.println("sayiyi buldunuz");
                tahminDogrumu = true;
                System.out.println("denemeSayisi = " + denemeSayisi);
            }

        } while (!tahminDogrumu);
        scanner.close();//achtiginiz kaynaklari kapatmak iyi birshey

    }
}
