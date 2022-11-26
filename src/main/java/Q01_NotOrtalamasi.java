import java.util.Scanner;

public class Q01_NotOrtalamasi {

    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih= input.nextInt();

        System.out.print("Muzik notunuzu giriniz: ");
        muzik = input.nextInt();

        int toplam = mat+fizik+kimya+turkce+tarih+muzik;
        int sonuc = toplam/6;
        System.out.println("Ortalamaniz: "+sonuc);

        if (sonuc>=60 && sonuc<=100){
            System.out.println("Gecer not");
        }else {
            System.out.println("Sinifta kaldi");
        }
    }

}
