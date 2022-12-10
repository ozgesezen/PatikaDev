import java.util.Scanner;

public class Q14_UcakBiletiFiyatiHesaplama {

    public static void main(String[] args) {
        int km, yas, yolculukTipi;
        double per = 0.1, normalTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km turunden giriniz: ");
        km = input.nextInt();

        System.out.print("Yasinizi giriniz: ");
        yas = input.nextInt();

        System.out.println("Yolculuk tipini giriniz\n 1=> Tek Yon , 2=> Gidis Donus");
        yolculukTipi = input.nextInt();

        normalTutar = km * per;
        if (km>0) {
            if (yas > 0) {
                if (yolculukTipi == 1) {
                    if (yas < 12) {
                        double yasIndirimi = normalTutar * 0.5;
                        System.out.println("Yas indiriminiz ile hesaplanan ucak bilet tutariniz: " + yasIndirimi);
                    } else if (yas >= 12 && yas <= 24) {
                        double yeniTutar = normalTutar * 0.9;
                        System.out.println("Indiriminiz ile hesaplanan ucak bilet tutariniz: " + yeniTutar);
                    } else if (yas >= 65) {
                        double tutar = normalTutar * 0.7;
                        System.out.println("Indirim ile hesaplanan ucak bilet tutariniz: " + tutar);
                    } else {
                        System.out.println("Ucak bilet tutariniz: " + normalTutar);
                    }
                } else if (yolculukTipi == 2) {
                    if (yas < 12) {
                        double yasIndirimi = (normalTutar * 0.5) * 0.8 * 2;
                        System.out.println("Yas indiriminiz ile hesaplanan ucak bilet tutariniz: " + yasIndirimi);
                    } else if (yas >= 12 && yas <= 24) {
                        double yeniTutar = (normalTutar * 0.9) * 0.8 * 2;
                        System.out.println("Indiriminiz ile hesaplanan ucak bilet tutariniz: " + yeniTutar);
                    } else if (yas >= 65) {
                        double tutar = (normalTutar * 0.7) * 0.8 * 2;
                        System.out.println("Indirim ile hesaplanan ucak bilet tutariniz: " + tutar);
                    } else {
                        System.out.println("Ucak bilet tutariniz: " + (normalTutar * 0.8) * 2);

                    }

                } else {
                    System.out.println("Hatali veri girdiniz");
                }
            } else {
                System.out.println("Hatali veri girdiniz");
            }
        }else {
            System.out.println("Hatali veri girdiniz");
        }
    }
}