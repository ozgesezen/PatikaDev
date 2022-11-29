import java.util.Scanner;

public class Q05_DaireninAlani {
    public static void main(String[] args) {
        int r , x;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen yaricapi giriniz: ");
        r= input.nextInt();

        double daireAlan = pi*r*r;
        double daireCevresi = 2*pi*r;
        System.out.print("Lutfen merkez acisinin olcusunu giriniz: ");
        x = input.nextInt();
        double daireAlanx = (pi*(r*r)*x)/360;
        System.out.println("Dairenin alani: "+daireAlan);
        System.out.println("Dairenin cevresi: "+daireCevresi);
        System.out.println("Merkez acili alan: "+daireAlanx);


    }
}
