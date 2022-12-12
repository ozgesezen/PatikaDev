import java.util.Scanner;

public class Q19_GirilenSayidanKucukIkininKuvvetleri {

    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sinir sayisini giriniz: ");
        n=input.nextInt();

        System.out.println("Ikinin Kuvvetleri:");
        for (int i=1; i<=n; i*=2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Dordun Kuvvetleri:");
        for (int i=1; i<=n; i*=4){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Besin Kuvvetleri:");
        for (int i=1; i<=n; i*=5){
            System.out.print(i+" ");
        }
    }

}
