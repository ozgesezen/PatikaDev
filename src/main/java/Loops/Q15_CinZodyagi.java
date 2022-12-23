package Loops;

import java.util.Scanner;

public class Q15_CinZodyagi {

    public static void main(String[] args) {

        int dogumYili;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen dogum yilinizi giriniz: ");
        dogumYili = input.nextInt();
        double cinZodyagi=dogumYili%12;

        if (cinZodyagi==0){
            System.out.println("Cin zodyagi burcunuz: Maymun");
        } else if (cinZodyagi==1) {
            System.out.println("Cin zodyagi burcunuz: Horoz");
        } else if (cinZodyagi==2) {
            System.out.println("Cin zodyagi burcunuz: Kopek");
        } else if (cinZodyagi==3) {
            System.out.println("Cin zodyagi burcunuz: Domuz");
        } else if (cinZodyagi==4) {
            System.out.println("Cin zodyagi burcunuz: Fare");
        } else if (cinZodyagi==5) {
            System.out.println("Cin zodyagi burcunuz: Okuz");
        } else if (cinZodyagi==6) {
            System.out.println("Cin zodyagi burcunuz: Kaplan");
        } else if (cinZodyagi==7) {
            System.out.println("Cin zodyagi burcunuz: Tavsan");
        } else if (cinZodyagi==8) {
            System.out.println("Cin zodyagi burcunuz: Ejderha");
        } else if (cinZodyagi==9) {
            System.out.println("Cin zodyagi burcunuz: Yilan");
        } else if (cinZodyagi==10) {
            System.out.println("Cin zodyagi burcunuz: At");
        } else if (cinZodyagi==11) {
            System.out.println("Cin zodyagi burcunuz: Koyun");
        }

    }

}
