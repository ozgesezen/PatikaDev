package Loops;

import java.util.Scanner;

public class Q27_MinMaxDeger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz: ");
        int a = input.nextInt();
        int girilenSayi, maxSayi = 0, minSayi = 0;
        for (int i = 1; i <= a; i++) {
            System.out.print(i + ". Sayiyi giriniz: ");
            girilenSayi = input.nextInt();
            if (i == 1) {
                maxSayi = girilenSayi;
                minSayi = girilenSayi;
            } else if (girilenSayi <= minSayi) {
                minSayi = girilenSayi;
            } else {
                maxSayi = girilenSayi;
            }
        }
        System.out.println("En buyuk sayi: " + maxSayi);
        System.out.println("En kucuk sayi: " + minSayi);

    }

}
