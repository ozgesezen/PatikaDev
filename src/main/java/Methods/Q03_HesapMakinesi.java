package Methods;

import java.util.Scanner;

public class Q03_HesapMakinesi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("1-Toplama Islemi\n2-Cikarma Islemi\n3-Carpma Islemi\n4-Bolme Islemi\n5-Usli Sayi Hesaplama\n6-Faktoryel Hesaplama\n7-Mod Alma\n8-Dikdortgen Alan ve Cevre Hesabi\nYapmak istediginiz islemi seciniz: ");
        int select = input.nextInt();
        switch (select){
            case 1:
                System.out.println("Toplama isleminin sonucu: "+plus());
                break;
            case 2:
                System.out.println("Cikarma isleminin sonucu: "+minus());
                break;
            case 3:
                System.out.println("Carpma isleminin sonucu: "+impect());
                break;
            case 4:
                System.out.println("Bolme isleminin sonucu: "+divided());
                break;
            case 5:
                System.out.println("Us alma isleminin sonucu: "+power());
                break;
            case 6:
                System.out.println("Faktoryel isleminin sonucu: "+faktoryel());
                break;
            case 7:
                System.out.println("Girilen sayinin modu: "+modAlma());
                break;
            case 8:
                alanCevre();
                break;
            default:
                System.out.println("Gecerli bir sayi giriniz");
                break;
        }

    }
    public static int plus(){
        int number,result=0;
        boolean select = true;
        while (select){
            Scanner input = new Scanner(System.in);
            System.out.println("Toplanacak sayilari giriniz: ");
            number= input.nextInt();
            System.out.println("Isleme devam etmek icin X'e \nBitirmek icin Q'a basiniz");
            String exit=input.next();
            result+=number;
            if (exit.equals("X")){
                continue;
            } else if (exit.equals("Q")) {
                select=false;
            }
        }
        return result;
    }

    public static int minus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz: ");
        int counter = input.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayi: ");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        return result;
    }

    public static int impect(){
        int number,result=1;
        boolean select = true;
        while (select){
            Scanner input = new Scanner(System.in);
            System.out.println("Carpma islemi yapilacak sayiyi giriniz: ");
            number= input.nextInt();
            System.out.println("Isleme devam etmek icin X'e \nBitirmek icin Q'a basiniz");
            String exit=input.next();
            result*=number;
            if (exit.equals("X")){
                continue;
            } else if (exit.equals("Q")) {
                select=false;
            }
        }
        return result;
    }

    public static double divided(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz: ");
        int counter = input.nextInt();
        double number, result = 0.0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayi: ");
            number = input.nextInt();
            if (i!=1 && number==0){
                System.out.println("Boleni 0 giremezsiniz");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        return result;
    }


    public static int power(){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayisini giriniz: ");
        int number = input.nextInt();
        System.out.print("Ussu giriniz: ");
        int us= input.nextInt();
        int result=1;
        for (int i=1; i<=us;i++){
            result*=number;
        }
        return result;
    }

    public static int faktoryel(){
        Scanner input = new Scanner(System.in);
        System.out.print("Faktoryeli alinacak sayiyi giriniz: ");
        int number = input.nextInt();
        int result =1;
        for (int i=1; i<=number;i++){
            result*=i;
        }
        return result;
    }

    public static int modAlma(){
        Scanner input = new Scanner(System.in);
        System.out.print("Modu alinacak sayiyi giriniz: ");
        int number = input.nextInt();
        int result= number%10;
        return result;
    }

    public static void alanCevre(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kisa kenari giriniz: ");
        int kisaKenar= input.nextInt();
        System.out.print("Uzun kenari giriniz: ");
        int uzunKenar = input.nextInt();
        int alan = kisaKenar*uzunKenar;
        int cevre = 2*(kisaKenar+uzunKenar);
        System.out.println("Dikdortgenin alani: "+alan);
        System.out.println("Dikdortgenin cevresi: "+cevre);
    }
}
