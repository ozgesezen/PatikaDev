package Loops;

import java.util.Scanner;

public class Q21_UsluSayiHesaplama {

    public static void main(String[] args) {

        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.print("Ussu alinacak sayi: ");
        a= input.nextInt();
        System.out.print("Us olacak sayi: ");
        b= input.nextInt();
        int total=1;

        for (int i=1; i<=b; i++){
            total*=a;
        }
        System.out.println("Sonuc: "+total);

    }

}
