package testklasi;

public class testKlasi {
    public static void main(String[] args) {
        String s = "Tramvay";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                break;
            }
            System.out.print(s.charAt(i));

        }
        System.out.println();
        //----------------------------------------
        String s1 = "PadMayaK001@";
        for (int j = 0; j < s1.length(); j++) {
            char ch = s1.charAt(j);
            if (ch >= 'a' & ch <= 'z') {
                continue;
            } else {
                System.out.print(ch);
            }
        }
        System.out.println();
        //----------------------------------------
        String t = "hsanuG";
        for (int i = t.length() - 1; i >= 0; i--) {
           // System.out.print(t.substring(i, i + 1));
            System.out.print(t.charAt(i));
        }
        //------------------------------------------
        System.out.println();
        int sum = 0;
        for (int i = 999999999; i > 0; i/=10) {
            sum +=i%10;
        }
        System.out.println("sum = " + sum);
        //----------------------------------------
        System.out.println("--------------------------");
        String name = "Messi";
        String unique = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if(name.indexOf(ch)==name.lastIndexOf(ch)){
                unique+=ch;
            }
        } System.out.println("Messi sozunun qisaldilmishi : "+ unique);
        System.out.println("---------------");
        //---------------------------------
        int summa = 0;
        for (int i = 6; i <11; i++) {
        summa +=i;
        }
        System.out.println("6dan 10a qeder reqemlerin toplam sayi = " + summa);
        System.out.println("------------------");
        //------------------------------

        for (int i = 1; i < 5; i++) {
            System.out.println("Week: "+ i);
            for (int j = 1; j < 8; j++) {
                System.out.println("     Day: "+j);
            }
        }
        System.out.println("---------------------");

        int satir = 3;
        int sutun = 5;

        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= sutun; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
        System.out.println("---------------------");

        int satir1 = 4;
        for (int i = 1; i <=satir1 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");

        double num = 28.587;
        String snum = String.valueOf(num);
        String decimalPart = snum.split("[\\.]")[1]; //587
        int intDecimalPart = Integer.valueOf(decimalPart); //unboxing

        System.out.println("intDecimalPart = " + intDecimalPart);
        int sum1 = 0;
        for (int i = intDecimalPart; i > 0 ; i/=10) {
            sum1 = sum1 + i%10;

        }
        System.out.println("sum1 = " + sum1);
        System.out.println("-------------------");
        int k   = 23;
        while (k>11){
            if (k%2==0){
                System.out.print(k+" ");
            }
            k--;
        }

    }
}
