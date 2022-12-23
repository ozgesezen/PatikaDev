package Loops;

import java.util.Scanner;

public class Q07_ManavKasaProgrami {

    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        Scanner input =new Scanner(System.in);
        System.out.print("Armut kac kilo : ");
        double armutkg = input.nextDouble();
        System.out.print("Elma kac kilo : ");
        double elmakg = input.nextDouble();
        System.out.print("Domates kac kilo : ");
        double domateskg = input.nextDouble();
        System.out.print("Muz kac kilo : ");
        double muzkg = input.nextDouble();
        System.out.print("Patlican kac kilo : ");
        double patlicankg = input.nextDouble();

        double toplam = armut*armutkg+elmakg*elma+domateskg*domates+muzkg*muz+patlicankg*patlican;
        System.out.println("Urunlerin toplam tutari: "+toplam);



    }

}
