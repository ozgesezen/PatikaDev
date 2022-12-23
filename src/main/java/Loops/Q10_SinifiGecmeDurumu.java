package Loops;

import java.util.Scanner;

public class Q10_SinifiGecmeDurumu {

    public static void main(String[] args) {

        int mat, turkce, fizik, kimya, muzik;
        int counter =0, toplam=0;


        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if (mat>=0 && mat<=100){
            toplam += mat;
            counter++;
        }
        System.out.print("Lutfen Turkce notunuzu giriniz: ");
        turkce = input.nextInt();
        if (turkce>=0 && turkce<=100){
            toplam+= turkce;
            counter++;
        }
        System.out.print("Lutfen Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if (fizik<=0 && fizik>=100){
            toplam+=fizik;
            counter++;
        }
        System.out.print("Lutfen Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if (kimya<=0 && kimya>=100){
            toplam+=kimya;
            counter++;
        }
        System.out.print("Lutfen Muzik notunuzu giriniz: ");
        muzik = input.nextInt();
        if (muzik<=0 && muzik>=100){
            toplam+=muzik;
            counter++;
        }


        double ort = (toplam)/counter;
        if (ort<=55){
            System.out.println("Sinifta kaldiniz!");
        }else {
            System.out.println("Tebrikler sinifi gectiniz!");
        }
        System.out.println("Ortalamaniz: "+ort);
    }

}
