import java.util.Scanner;

public class BurcHesaplamasi {

    public static void main(String[] args) {

        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.print("Dogdugunuz ayi giriniz(Sayisal olarak): ");
        a= input.nextInt();

        System.out.print("Dogdugunuz gunu giriniz(Sayisal olarak): ");
        b= input.nextInt();

        if (a==1){
            if (b>=1 && b<=21){
                System.out.println("Burcunuz Oglak");
            } else if (b>=22 && b<=31) {
                System.out.println("Burcunuz Kova");
            }
        } else if (a==2) {
            if (b>=1 && b<=19){
                System.out.println("Burcunuz Kova");
            } else if (b>=20 && b<=28) {
                System.out.println("Burcunuz Balik");
            }
        } else if (a==3) {
            if (b>=1 && b<=20){
                System.out.println("Burcunuz Balik");
            } else if (b>=21 && b<=31) {
                System.out.println("Burcunuz Koc");
            }
        } else if (a==4) {
            if (b>=1 && b<=20){
                System.out.println("Burcunuz Koc");
            } else if (b>=21 && b<=30) {
                System.out.println("Burcunuz Boga");
            }
        } else if (a==5) {
            if (b>=1 && b<=21){
                System.out.println("Burcunuz Boga");
            } else if (b>=22 && b<=31) {
                System.out.println("Burcunuz Ikizler");
            }
        } else if (a==6) {
            if (b>=1 && b<=22){
                System.out.println("Burcunuz Ikizler");
            } else if (b>=23 && b<=30) {
                System.out.println("Burcunuz Yengec");
            }
        } else if (a==7) {
            if (b>=1 && b<=22){
                System.out.println("Burcunuz Yengec");
            } else if (b>=23 && b<=31) {
                System.out.println("Burcunuz Aslan");
            }
        } else if (a==8) {
            if (b>=1 && b<=22){
                System.out.println("Burcunuz Aslan");
            } else if (b>=23 && b<=31) {
                System.out.println("Burcunuz Basak");
            }
        } else if (a==9) {
            if (b>=1 && b<=22){
                System.out.println("Burcunuz Basak");
            } else if (b>=23 && b<=30) {
                System.out.println("Burcunuz Terazi");
            }
        } else if (a==10) {
            if (b>=1 && b<=22){
                System.out.println("Burcunuz Terazi");
            } else if (b>=23 && b<=31) {
                System.out.println("Burcunuz Akrep");
            }
        } else if (a==11) {
            if (b>=1 && b<=21){
                System.out.println("Burcunuz Akrep");
            } else if (b>=22 && b<=30) {
                System.out.println("Burcunuz Yay");
            }
        } else if (a==12) {
            if (b>=1 && b<=21){
                System.out.println("Burcunuz Yay");
            } else if (b>=22 && b<=31) {
                System.out.println("Burcunuz Oglak");
            }
        }

    }

}
