import java.util.Scanner;

public class Q29_TersUcgen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayisini Giriniz: ");
        int basamak = input.nextInt();

        for (int m = basamak - 1; m >= 1; m--) {
            for (int k = (basamak - m); k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = (2 * m - 1); j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

