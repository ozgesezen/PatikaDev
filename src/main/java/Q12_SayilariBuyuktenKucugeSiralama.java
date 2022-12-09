import java.util.Scanner;

public class Q12_SayilariBuyuktenKucugeSiralama {

    public static void main(String[] args) {

        int a,b,c;

        Scanner input = new Scanner(System.in);
        System.out.print("1. sayi: ");
        a=input.nextInt();

        System.out.print("2. sayi: ");
        b=input.nextInt();

        System.out.print("3. sayi: ");
        c= input.nextInt();

        if (a<b && a<c){
            if (b<c){
                System.out.println("1. sayi < 2. sayi < 3. sayi");
            }else {
                System.out.println("1. sayi < 3. sayi < 2. sayi");
            }
        } else if (b<a && b<c) {
            if (a<c){
                System.out.println("2. sayi < 1. sayi < 3. sayi");
            }else {
                System.out.println("2. sayi < 3. sayi < 1. sayi");
            }
        }else {
            if (b<a){
                System.out.println("3. sayi < 2. sayi < 1. sayi");
            }else {
                System.out.println("3. sayi < 1. sayi < 2. sayi");
            }
        }

    }

}
