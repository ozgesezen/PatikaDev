import java.util.Scanner;

public class Q26_EbobEkokBulanProgram {

    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        a=input.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        b=input.nextInt();
        int ebob=1;

        System.out.println(a+" Sayisinin bolenleri: ");
        for (int i=1; i<100;i++){
            if (a%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println(b+" Sayisinin bolenleri: ");
        for (int i=1; i<100;i++){
            if (b%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println(a+" ve "+b+"'nin ortak bolenleri");
        for (int i=1; i<100;i++){
            if (a%i==0 && b%i==0){
                System.out.print(i+" ");
                ebob=i;
            }
        }
        System.out.println();
        System.out.println(a+" ve "+b+"'nin ebob degeri: "+ebob);

        System.out.print(a+" ve "+b+"'nin ekok degeri: ");
        for (int i=1; i<a*b;i++){
            if (i%a==0 && i%b==0){
                System.out.println(i);
                break;
            }
        }



    }

}
