package tekrarlar_qarishiq;

import java.util.Random;
import java.util.Scanner;

public class LoopsRandomNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rastgeleSayi = random.nextInt(101);
        System.out.println(rastgeleSayi);
        //Istifadechi neche defe yoxladigini saxlayan deyishen
        int saygac = 0;
        // Ehtimal edilen reqemleri saxlayan deyishen
        System.out.println("0-100 arasi dogru reqemi tapin!");
        int ehtimalNum;
        boolean texminDogrudurmu = false;
        do{
            System.out.print("Texmininizi yazin:  ");
            ehtimalNum = scanner.nextInt();
            saygac++;
            if (ehtimalNum<rastgeleSayi){
                System.out.print("Reqemi artir   ---   ");

            } else if (ehtimalNum>rastgeleSayi) {
                System.out.print("Reqemi azalt   ---   ");
            }else {
                texminDogrudurmu = true;
                System.out.println("Dogru texmini tapdiniz!");
                System.out.println("rastgeleSayi = " + rastgeleSayi);
                System.out.println("ehtimalNum = " + ehtimalNum);
                System.out.println("saygac = " + saygac);
            }


        }while(!texminDogrudurmu);
        scanner.close();
    }


}
