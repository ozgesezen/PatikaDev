package Loops;

import java.util.Scanner;

public class Q18_TekSayilarinToplaminiBul {

    public static void main(String[] args) {

        int n;
        int total =0;
        Scanner input = new Scanner(System.in);

//        do {
//            System.out.print("Sayi Giriniz: ");
//            n=input.nextInt();
//            if (n%2==1){
//                total+=n;
//            }
//        }while (n>0);
//        System.out.println("Tek sayilarin toplami: "+total);

        do {
            System.out.print("Sayi Giriniz: ");
            n=input.nextInt();
            if (n%4==0){
                total+=n;
            }
        }while (n%2==0);
        System.out.println("4'un kati olan sayilarin toplami; "+total);

    }
}
