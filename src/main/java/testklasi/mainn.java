package testklasi;

import java.util.Scanner;

public class mainn {
    public static void main(String[] args) {
/*        Student Farid = new Student();
        System.out.prinln("Farid.stdName = " + Farid.stdName);
        System.out.println("Farid.address = " + Farid.address);
        System.out.println("Farid.email = " + Farid.email);
        System.out.println("Farid = " + Farid);*/
//        String newName = Student.stdName = "Ahu";
//        System.out.println("newName = " + newName);
//        System.out.println(Student.isPolindrom());



        Senaryo.seenaryo();
    }


    public static class Senaryo {
        static Scanner sc = new Scanner(System.in);


        public static void seenaryo(){

            int counter = 0;
                    do {
                        System.out.println("Kullanici adinizi giriniz");
                        String userName = sc.next();
                        System.out.println("Kullanici shifrenizi giriniz");
                        String password = sc.next();
                        if (userName.equals("Noname") && password.equals("123456")) {
                            System.out.println("Dear " + userName + " You entered system! Congratulations!");
                            break;
                        } else {
                            System.out.println("Username you have written: " + userName);
                            System.out.println("Password you have written: " + password);
                            System.out.println("Couldn't enter");
                            counter++;
                            if(counter==3){
                                System.out.println("---->>>Your account has blocked<<<----");
                                System.out.println("Reset your account");
                                break;

                            }
                        }



                    }while (true) ;
            }

        }
}
