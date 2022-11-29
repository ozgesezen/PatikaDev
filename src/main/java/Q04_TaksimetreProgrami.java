import java.util.Scanner;

public class Q04_TaksimetreProgrami {

    public static void main(String[] args) {
        double taksiMetreKmBasina = 2.20;
        int taksiMetreAcilis = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        int km = input.nextInt();
        double ucret = taksiMetreAcilis + (km*taksiMetreKmBasina);

        if (ucret <20){
            System.out.println("Taksi ucreti: 20 Tl");
        }else {
            System.out.println("Taksi ucreti: "+ucret);
        }
    }

}
