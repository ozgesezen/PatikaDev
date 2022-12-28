package Methods;

import java.util.Scanner;

public class Q06_DeseneGoreMethodOlusturma {

    static int numberRule(int number, int tempNumber, int lastNumber){
        if (number>0){
            System.out.print(number+" ");
            return numberRule(number-5,tempNumber-5, lastNumber);
        }
        if (tempNumber<=lastNumber){
            System.out.print(tempNumber+" ");
            return numberRule(number,tempNumber+5,lastNumber);
        }
        return lastNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.print("Lutfen bir sayi giriniz: ");
            number=input.nextInt();
            numberRule(number,number,number);
            System.out.println();
        }while (number>0);
    }
}
