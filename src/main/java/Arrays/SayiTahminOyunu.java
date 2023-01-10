package Arrays;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);
        Scanner input = new Scanner(System.in);

        int counter=0;
        for (int i=0; i<5; i++){
            System.out.print("Lutfen tahin ettiginiz sayiyi giriniz: ");
            int select = input.nextInt();
            counter++;
            if (select<0 || select>100){
                System.out.println("Lutfen 0 ila 100 arasinda bir sayi giriniz");
                System.out.println("Kalan hakkiniz: "+(5-counter));
                continue;
            }
            if (select==number){
                System.out.println("Tebrikler Kazandiniz!!");
            }else if (select>number){
                if (counter<5) {
                    System.out.println("Yanlis tahmin ettiniz! Daha kucuk bir sayi giriniz!");
                    System.out.println("Kalan hakkiniz: " + (5 - counter));
                }if (counter==5){
                    System.out.println("Yanlis tahmin ettiniz, hakkiniz kalmamistir!");
                }
            } else if (select<number) {
                if (counter<5) {
                    System.out.println("Yanlis tahmin ettiniz! Daha buyuk bir sayi giriniz!");
                    System.out.println("Kalan hakkiniz: " + (5 - counter));
                }if (counter==5){
                    System.out.println("Yanlis tahmin ettiniz, hakkiniz kalmamistir!");
                }
            }

        }
    }
}
