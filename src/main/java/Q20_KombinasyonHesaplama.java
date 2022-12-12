import java.util.Scanner;

public class Q20_KombinasyonHesaplama {

    public static void main(String[] args) {

        int n,r,total1=1,kombinasyonDeg, totatl2=1,total3=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Kombinasyonu alinacak sayiyi giriniz: ");
        n= input.nextInt();
        System.out.print("Kacli kombinasyonu olacagini giriniz: ");
        r=input.nextInt();

        for (int i=1; i<=n; i++){
            total1=i*total1;
        }
        for (int i=1; i<=r; i++){
            totatl2=i*totatl2;
        }
        int n_eksi_r = n-r;
        for (int i=1; i<=n_eksi_r; i++){
            total3=i*total3;
        }
        kombinasyonDeg= total1/(totatl2*total3);
        System.out.println(n+" sayinin "+r+"'li kombinasyonu: "+kombinasyonDeg);


    }

}
