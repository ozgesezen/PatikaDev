package Loops;

import java.util.Scanner;

public class Q06_VucutKitleIndeksiHesaplama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen boyunuzu(Metre cinsinden) giriniz: ");
        double boy = input.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz: ");
        double kilo = input.nextDouble();
        double vki = kilo/(boy*boy);
        System.out.println("Vucut kitle indeksiniz: "+vki);

    }

}
