package Loops;

import java.util.Scanner;


public class WhileDongusu {
    public static void main(String[] args) {
        int left = 100, right = 200;
        while (++left < --right) ;
        System.out.println(left);
        /*
        Bu algoritma, 100 ile 200’ün arasında tam ortada bulunan sayıyı bulmamızı sağlar. Kodu çalıştırdığımızda çıktısı şu şekilde olur:

        100 ile 200'ün ortası: 150
         */

        Scanner scanner = new Scanner(System.in);
       /* String customerPassword = "12345";
        boolean passwordSuccessfull = false;

        while (!passwordSuccessfull) {

            System.out.println("Hesap şifrenizi giriniz:");
            String typedPassword = scanner.next();

            if (customerPassword.contentEquals(typedPassword)) {
                passwordSuccessfull = true;
                System.out.println("Sisteme başarılı giriş yaptınız!");
            }
        }*/
        int sayi;
        for (boolean run = true; run;){
            System.out.println("Sayi Giriniz: ");
            sayi = scanner.nextInt();
            if (sayi<0){
                run=false;
            }
        }


    }
}