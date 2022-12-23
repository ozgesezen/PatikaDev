package Loops;

import java.util.Scanner;

public class Q25_AtmProjesi {

    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balace = 1500;
        int select;

        while(right>0) {
            System.out.print("Kullanici adiniz: ");
            userName = input.nextLine();

            System.out.print("Parolaniz: ");
            password = input.nextLine();
            if (userName.equals("patika")&&password.equals("dev123")){
                System.out.println("Merhaba Kodluyoruz bankasina hos geldiniz.");
                do {
                    System.out.println("1- Para yatirma\n2-Para Cekme\n3-Bakiye Sorgula\n4-Cikis Yap");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");

                    select = input.nextInt();
                    if (select==1) {
                        System.out.print("Para miktari: ");
                        int price = input.nextInt();
                        balace += price;
                        System.out.println("Yeni bakiyeniz: "+balace);
                    } else if (select==2) {
                        System.out.print("Para miktari: ");
                        int price = input.nextInt();
                        if (price>balace){
                            System.out.println("Bakiye yetersiz");
                        }else {
                            balace-=price;
                            System.out.println("Yeni bakiyeniz: "+balace);
                        }
                    } else if (select==3) {
                        System.out.println("Bakiyeniz: "+balace);
                    }
                }while (select!=4);
                System.out.println("Tekrar gorusmek uzere");
                break;
            }else {
                right--;
                System.out.println("hatali kullanici adi veya sifre");
                if (right==0){
                    System.out.println("Hesabiniz bloke olmustur");
                }else {
                    System.out.println("Kalan hakkiniz: " + right);
                }
            }

        }
    }

}
