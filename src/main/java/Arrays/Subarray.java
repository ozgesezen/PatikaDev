package Arrays;

import java.util.Scanner;

public class Subarray {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        input.close();

        int negative = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int current_sum = 0;
                for (int k = i; k <= j; k++) {
                    current_sum += arr[k];
                }
                if (current_sum < 0) {
                    negative++;
                }
            }
        }
        System.out.println(negative);
    }

}
