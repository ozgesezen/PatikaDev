package Methods;

import java.util.Scanner;

public class Q04_UsHesabi {
    public static void main(String[] args) {
        System.out.println("Sonuc: "+usAlma());
    }

    public static int usAlma(){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban degeri giriniz: ");
        int number1= input.nextInt();
        System.out.print("Us degerini giriniz: ");
        int number2= input.nextInt();
        int result=1;
        for (int i=1; i<=number2;i++){
            result*=number1;
        }
        return result;
    }
}
