package Loops;

import java.util.Scanner;

public class Q17_GirilenSayilardanCiftOlaniBul {

    public static void main(String[] args) {

        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        sayi = input.nextInt();

        for (int i =2; i<=sayi; i+=2){
            System.out.println(i);
        }
        System.out.println("Girdiginiz sayiya kadar olan cift sayilar");
        int top=0;
                int counter =-1;
        for (int i=0; i<=sayi; i++){
            if (i%3==0 && i%4==0){
                top=i+top;
                counter++;
            }
        }
        System.out.println("Girdiginiz sayiya kadar 3 ve 4 de kalansiz bolunen sayilarin ortyalamasi: "+top/counter);
    }


}
