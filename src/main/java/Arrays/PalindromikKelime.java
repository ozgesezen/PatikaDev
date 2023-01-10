package Arrays;

import java.util.Scanner;

public class PalindromikKelime {

    public static void main(String[] args) {

        String original, reserve ="";
        Scanner input = new Scanner(System.in);
        System.out.print("Palindromik kontrolu istediginiz kelimeyi giriniz: ");
        original = input.nextLine();
        for (int i=original.length()-1; i>=0; i--){
            reserve+=original.charAt(i);
        }
        if (original.equals(reserve)){
            System.out.println("Palindrom Kelime");
        }else {
            System.out.println("Palindrom kelime degil!");
        }
    }
}
