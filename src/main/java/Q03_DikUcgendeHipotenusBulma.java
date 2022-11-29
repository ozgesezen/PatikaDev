import java.util.Scanner;

public class Q03_DikUcgendeHipotenusBulma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen dik ucgenin kisa kenarini giriniz: ");
        int kisaKenar = input.nextInt();
        System.out.print("Lutfen dik ucgenin uzun kenarini giriniz: ");
        int uzunKenar = input.nextInt();

        double hipotenusKaresi = ((kisaKenar*kisaKenar)+(uzunKenar*uzunKenar));
        double hipotenus = Math.sqrt(hipotenusKaresi);
        System.out.println("Dik ucgenin hipotenusu: "+hipotenus);

        //uc kenar uzunlugu kullanicidan alinan ucgenin alanini hesaplayan
        System.out.print("1. kenar uzunlugunu giriniz: ");
        int a = input.nextInt();
        System.out.print("2. kenar uzunlugunu giriniz: ");
        int b = input.nextInt();
        System.out.print("3. kenar uzunlugunu giriniz: ");
        int c = input.nextInt();

        int u = (a+b+c)/2;
        int ucgeninCevresi =2*u;
        double ucgeninAlani = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Ucgenin Alani: "+ucgeninAlani);
    }

}
