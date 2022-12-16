import java.util.Scanner;

public class Q28_MukemmelSayi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi = input.nextInt();
        int sum = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                sum += i;
            }
        }
        if (sum==sayi){
            System.out.println(sayi+" Mukemmel sayidir");
        }else {
            System.out.println(sayi+" Mukemmel sayi degildir");
        }

    }

}
