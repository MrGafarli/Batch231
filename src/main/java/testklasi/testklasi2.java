package testklasi;

import java.util.Scanner;

public class testklasi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelimeni daxil et: ");
        String userWord = input.next();
        for (int i = 0; i < userWord.length(); i++) {
            if (userWord.charAt(i)=='c'){
                System.out.println(userWord);
                System.out.println("Sona geldik yahu");
                break;
            }
        }
    }
}
