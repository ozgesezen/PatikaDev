package Loops;

import java.util.Scanner;

public class Q09_KullaniciGirisi {

    public static void main(String[] args) {
        String userName,password, yeniSifre;
        int secenek;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici Adinizi Giriniz: ");
        userName = input.nextLine();
        System.out.println("Sifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giris yaptiniz");
        }else {
            System.out.println("Bilgileriniz hatali!");
            System.out.println("Sifrenizi sifirlamak istiyorsaniz-1\nIstemiyorsaniz-2'yi tuslayiniz");
            secenek = input.nextInt();
            input.nextLine();
            if (secenek==1){
                System.out.println("Lutfen yeni sifrenizi giriniz: ");
                yeniSifre = input.nextLine();
                if (yeniSifre.equals("java123") || yeniSifre.equals("password")){
                    System.out.println("Hatali giridiginiz veya unuttugunuz sifreden farkli olmalidir, sifreniz olusturulamadi");
                }else {
                    System.out.println("Sifreniz olusturuldu");
                }
            } else if (secenek==2) {
                System.out.println("Tesekkur ederiz");
            }
        }
    }

}
