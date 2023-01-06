package Arrays;

public class ArraydekiElemanlarinFrekansi {

    public static void main(String[] args) {


        int[] arr = new int[] { 10, 20, 20, 10, 10, 20, 5, 20 };
        int[] dublicate = new int[arr.length];
        int counter = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    dublicate[j] = counter;
                }
            }
            if (dublicate[i] != counter) {
                dublicate[i] = count;
            }
        }

        for (int i = 0; i < dublicate.length; i++) {
            if (dublicate[i] != counter) {
                System.out.println(arr[i] + " sayisi " + dublicate[i] + " kez tekrar etti. ");
            }
        }

    }
}
