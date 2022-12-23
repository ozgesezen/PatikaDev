package Loops;

import java.util.Scanner;

public class Q22_ArmstrongSayi {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.print("Sayi Giriniz: ");
//        int number = input.nextInt();
//        int basNumber=0, tempNumber = number;
//        int basValue;
//        int result=0;
//        int basPow;
//
//        while (tempNumber!=0) {
//            tempNumber /= 10;
//            basNumber++;
//        }
//        tempNumber=number;
//        while (tempNumber!=0){
//            basValue=tempNumber%10;
//            basPow=1;
//            for (int i=1; i<=basNumber; i++){
//                basPow *= basValue;
//            }
//            result+=basPow;
//            tempNumber/=10;
//        }
//        if (result==number){
//            System.out.println(number+" bir armstrong sayisidir");
//        }else {
//            System.out.println(number+" bir armstrong sayi degildir");
//        }

        System.out.println("uc basamakli armstrong Sayilar: ");
        for (int i = 100; i <= 999; i++) {
            int basNumber = 0;
            int number = i;
            while (number != 0) {
                number /= 10;
                basNumber++;
            }
            number = i;

            int result = 0;

            while (number != 0) {
                int basValue = number % 10;
                int basPow = 1;

                for (int k = 1; k <= basNumber; k++) {
                    basPow *= basValue;
                }
                result += basPow;
                number /= 10;
            }
            if (i == result) {
                System.out.print(i + " ");
            }

//        int yuzler,onlar,birler,toplam;
//        System.out.println("Armstrong Sayilar: ");
//        for (int i=100;i<1000;i++){
//            yuzler=i/100;
//            onlar=(i%100)/10;
//            birler=i%10;
//            toplam= (int) (Math.pow(yuzler,3)+Math.pow(onlar,3)+Math.pow(birler,3));
//            if (i==toplam){
//                System.out.println(i+" ");
//            }
//        }


        }





    }

}


