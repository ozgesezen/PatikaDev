package Loops;

import java.util.Scanner;

public class Q11_HavaSicakliginaGoreEtkinlikOnerme {

    public static void main(String[] args) {

        int sicaklik;

        Scanner input = new Scanner(System.in);
        System.out.print("Sicaklik giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik<=5){
            System.out.println("Kayak yapabilirsiniz");
        } else if (sicaklik<=25) {
            if (sicaklik>5 && sicaklik<=15){
                System.out.println("Sinemaye gidebilirsin");
            }
            if (sicaklik>=10 && sicaklik<=25){
                System.out.println("Piknige gidebilirsiniz");
            }
        }else {
            System.out.println("Yuzmeye gidebilirsiniz");
        }

    }

}
