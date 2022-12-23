package Methods;

public class Q01_PalindromSayi {

    public static void main(String[] args) {

        System.out.println(isPalindrom(87));
    }
    private static boolean isPalindrom(int number){
        int temp = number, lastnumber, reserveNumber=0;
        while (temp !=0){
            lastnumber=temp%10;
            reserveNumber = reserveNumber*10+lastnumber;
            temp/=10;
        }
        if (reserveNumber==number){
            return true;
        }else {
            return false;
        }
    }
}
