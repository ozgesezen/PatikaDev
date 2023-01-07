package Arrays;

public class MatrisTranspozunuBulma {

    public static void main(String[] args) {

        int[][] arr = new int[2][3];
        int[][] brr = new int[3][2];
        int number = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=number++;
            }
        }

        System.out.println("Matris :");
        for (int i =0; i<arr.length;i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

        for (int i=0; i<brr.length; i++){
            for (int k=0; k<brr[i].length; k++){
                brr[i][k]=arr[k][i];
            }
        }
        System.out.println("Transpoze :");
        for (int i =0; i<brr.length;i++){
            for (int j=0; j<brr[i].length; j++){
                System.out.print(brr[i][j]+"  ");
            }
            System.out.println();
        }


    }

}
