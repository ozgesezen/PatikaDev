package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayGeneral {

    static int[] reverse(int[] list){
        int[] reverse = new int[list.length];
        for (int i=0,j= list.length-1; i< list.length;i++,j--){
            reverse[i]=list[j];
        }
        return reverse;
    }
    static void printArray(int[] list){
        for (int i=0; i< list.length; i++){
            System.out.println(list[i]);
        }
    }

    public static void main(String[] args) {
        int[] list = {10,20,30,40,50,60,70,80,90,100};
        int[] newList = reverse(list);
        printArray(newList);


        String[] weekendDays = new String[]{"Cumartesi","Pazar"};
        System.out.println(weekendDays[0]);


        int[][] matris = new int[3][4];
        int number=1;
        for (int i=0; i< matris.length; i++){
            for (int j=0; j<matris[i].length; j++){
                matris[i][j]=number++;
            }
        }

        for (int i=0; i< matris.length; i++){
            for (int j=0; j< matris[i].length; j++){
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }

        int[][] matrix = new int[3][4];
        Scanner scan = new Scanner(System.in);
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print("Arrayin "+i+","+j+". elemanini giriniz: ");
                matrix[i][j]= scan.nextInt();
            }
        }

        Arrays.fill(list,2,5,5);
        //fill methoda array dizisinin adini girdikten sonra virgulle tek deger girersek arraydeki butun degerleri o deger ile degisiyor
        //eger bir araligi degistirmek istiyorsakhangi indexden hangi indexe kadar olacagini belirtip sonrasinda degeri girdigimizda o araligi
        //istenen degerle degistirmis oluyoruz.

        int[] copyList = Arrays.copyOf(list,5); // egerin verilen degeri kadarini yeni bir arraye kopyaliyor
        int[] copyList1= Arrays.copyOfRange(list,2,5); //aralik istedigimiz arraylarde kopyalama icin

    }
    public double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {

        // firstMatrix.length ile ilk matrisin satır sayısını buluyoruz. örneğimizde 3 olarak gelecektir.
        // secondMatrix[0].length ile ikinci matrisin sütun sayısını buluyoruz. örneğimizde 4 olarak gelecektir.

        // C matrisi olacak olan matrisi tanımlıyoruz.
        double[][] result = new double[firstMatrix.length][secondMatrix[0].length];

        // matrislerde çarpma, toplama gibi işlemleri yapabilmek için iç içe 3 tane döngüye ihtiyaç duyarız.
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = multiplyMatricesCell(firstMatrix, secondMatrix, row, col);
            }
        }

        return result;
    }


    double multiplyMatricesCell(double[][] firstMatrix, double[][] secondMatrix, int row, int col) {
        // A matrisinin satırı ile B matrisinin sütunu çarpma işlemi.
        /*
         *   row = 3, col = 4  olarak gelecektir.
         *   i = 0 ise
         *   firstMatrix[3][0] * secondMatrix[0][4]
         *   i = 1 ise
         *   firstMatrix[3][1] * secondMatrix[1][4]
         *   i = 2 ise
         *   firstMatrix[3][2] * secondMatrix[2][4]
         * şeklinde i değişerek satır ve sütun çarpılır.
         */
        double cell = 0;
        for (int i = 0; i < secondMatrix.length; i++) {
            cell += firstMatrix[row][i] * secondMatrix[i][col];
        }
        return cell;
    }



}
