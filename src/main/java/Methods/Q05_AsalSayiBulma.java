package Methods;

import java.util.Scanner;

public class Q05_AsalSayiBulma {

    public static void main(String[] args) {

        asalSayi();
    }

    public static void asalSayi(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kontrol etmek istediginiz sayiyi giriniz: ");
        int number = input.nextInt();
        int counter=0;
        for (int i=1; i<=number;i++){
            if (number%i==0){
                counter++;
            }
        }
        if (counter==2){
            System.out.println(number+" sayisi asal sayidir");
        }else {
            System.out.println(number+" sayisi asal sayi degildir");
        }
    }
}
