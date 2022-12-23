package Loops;

import java.util.Scanner;

public class Q24_YildizlarIleElmasYapma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen sayi giriniz: ");
        int n = input.nextInt();

        for (int i = 1; i<=n ; i++){
            for (int k=1; k<=(n-i); k++){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int m=n-1; m>=1; m--){
            for (int k=(n-m); k>=1; k--){
                System.out.print(" ");
            }
            for (int j= (2*m-1); j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
