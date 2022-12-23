package Loops;

import java.util.Scanner;

public class Q02_KdvTutari {
    public static void main(String[] args) {

        double kdvOrani =0.18;
        double kdvOrani1 =0.08;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen tutar giriniz: ");
        double kdvsizTutar = input.nextDouble();
        if (kdvsizTutar>=0 && kdvsizTutar<=1000) {
            double kdvTutari = kdvsizTutar * kdvOrani;
            double kdvliTutar = kdvsizTutar + kdvTutari;
            System.out.println("Kdv'siz Fiyat = " + kdvsizTutar);
            System.out.println("Kdv'li Fiyat = " + kdvliTutar);
            System.out.println("Kdv Tutari = " + kdvTutari);
        } else if (kdvsizTutar>1000) {
            double kdvTutari = kdvsizTutar * kdvOrani1;
            double kdvliTutar = kdvsizTutar + kdvTutari;
            System.out.println("Kdv'siz Fiyat = " + kdvsizTutar);
            System.out.println("Kdv'li Fiyat = " + kdvliTutar);
            System.out.println("Kdv Tutari = " + kdvTutari);
        }

    }
}
