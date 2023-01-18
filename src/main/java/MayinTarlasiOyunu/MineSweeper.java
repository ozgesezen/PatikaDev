package MayinTarlasiOyunu;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    Scanner input = new Scanner(System.in);

    int row, col, size;
    String[][] emptyMap;
    String[][] mineMap;
    boolean isOver = false;


    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.size = row * col;
        this.emptyMap = new String[row][col];
        this.mineMap = new String[row][col];
    }

    public String[][] createMineMap() {
        int count = 0;
        this.mineMap = new String[row][col];
        int mayinSayisi = (row * col) / 4;
        while (count != mayinSayisi) {
            int randomRow, randomCol;
            Random random = new Random();
            randomRow = random.nextInt(this.row);
            randomCol = random.nextInt(this.col);
            if (mineMap[randomRow][randomCol] != "*") {
                mineMap[randomRow][randomCol] = "*";
                count++;
            }
            for (int i = 0; i < mineMap.length; i++) {
                for (int j = 0; j < mineMap[i].length; j++) {
                    if (mineMap[i][j] != "*") {
                        mineMap[i][j] = "-";
                    }
                }
            }
        }
        return mineMap;
    }

    public String[][] gameMap() {
        this.emptyMap=new String[this.row][this.col];
        for (int i=0; i<emptyMap.length; i++) {
            for (int j=0; j<emptyMap[i].length; j++) {
                emptyMap[i][j]="-";
            }
        }
        return emptyMap;
    }

    public boolean checkSelect(int selectRow, int selectCol) {
        return (selectRow < this.row && selectCol < this.col) || (selectRow >= 0 && selectCol >= 0);
    }

    public boolean checkMine(int selectRow, int selectCol) {
        return mineMap[selectRow][selectCol].equals("*");
    }


    public int count(int selectRow, int selectCol) {
        int counter = 0;
        if (selectCol-1>=0){
            if (selectRow-1>=0){
                if (mineMap[selectRow-1][selectCol-1].equals("*")){
                    counter++;
                }
            }
            if (selectRow<this.col){
                if (mineMap[selectRow][selectCol-1].equals("*")){
                    counter++;
                }
            }if (selectRow+1<this.col){
                if (mineMap[selectRow+1][selectCol-1].equals("*")){
                    counter++;
                }
            }
        }
        if (selectCol<this.row){
            if (selectRow-1>=0){
                if (mineMap[selectRow-1][selectCol].equals("*")){
                    counter++;
                }
            }
            if (selectRow+1<this.col){
                if (mineMap[selectRow+1][selectCol].equals("*")){
                    counter++;
                }
            }
        }
        if (selectCol+1<this.row){
            if (selectRow-1>=0){
                if (mineMap[selectRow-1][selectCol+1].equals("*")){
                    counter++;
                }
            }
            if (selectRow<this.col){
                if (mineMap[selectRow][selectCol+1].equals("*")){
                    counter++;
                }
            }if (selectRow+1<this.col){
                if (mineMap[selectRow+1][selectCol+1].equals("*")){
                    counter++;
                }
            }
        }
        return counter;
    }


    public String[][] checkmap(int selectRow,int selectCol){
        this.emptyMap[selectRow][selectCol] = String.valueOf(count(selectRow, selectCol));
        this.mineMap[selectRow][selectCol] = String.valueOf(count(selectRow, selectCol));
        return emptyMap;
    }

    boolean checkWin() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (this.mineMap[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }


    public void run() {
        createMineMap();
        print(createMineMap());
        System.out.println("Mayin tarlasi oyununa hos geldiniz. .");
        print(gameMap());
        while (!isOver) {
            System.out.print("Lutfen satir sayisini giriniz: ");
            int selectRow = input.nextInt();
            System.out.print("Lutfen sutun sayisini giriniz: ");
            int selectCol = input.nextInt();
            if (!checkSelect(selectRow, selectCol)) {
                System.out.println("Lutfen oyun sinirlari icerisinde olan bir deger girisi yapiniz");
                continue;
            }
            if (checkMine(selectRow, selectCol)) {
                System.out.println("Oyunu kaybettiniz");
                break;
            }
            print(checkmap(selectRow,selectCol));
            if (checkWin()) {
                System.out.println("Tebrikler Kazandiniz. .");
                break;
            }
        }
    }
    public void print(String[][] map){
        System.out.println("===========================================");
        for (String[] i : map) {
            for (String j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("===========================================");
    }
}
