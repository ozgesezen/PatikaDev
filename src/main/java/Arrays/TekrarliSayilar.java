package Arrays;

import java.util.Arrays;

public class TekrarliSayilar {

    public static void main(String[] args) {

        int[] arr = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1, 2};
        int[] duplicate = new int[arr.length];
        int index=0;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j< arr.length; j++){
                if (i != j && (arr[i]==arr[j])){
                    if (!isFind(duplicate,arr[i]))
                    duplicate[index++]=arr[i];
                }
            }

        }
        for (int value : duplicate){
            if (value != 0 && value%2==0 ){
                System.out.print(value);
            }
        }
    }

    static boolean isFind(int[] arr, int value){
        for (int i: arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }

}
