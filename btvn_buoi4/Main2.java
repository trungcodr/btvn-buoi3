package btvn_buoi4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhap so dong so cot cua ma tran A
        int [] dimensionA = inputDimension(scanner, "A");
        int rowA = dimensionA[0];
        int colA = dimensionA[1];
        //Nhap so hang so cot cua ma tran B
        int [] dimensionB = inputDimension(scanner, "B");
        int rowB = dimensionB[0];
        int colB = dimensionB[1];
        //Kiem tra kich thuoc hai ma tran
        if (!checkDimension(rowA,colA,rowB,colB)){
            System.out.println("Khong the thuc hien duoc!");
        }
        else {
            //Nhap ma tra A
            int [][] arrA = inputMatrix(scanner, rowA,colA,"A");
            //Nhap ma tran B
            int [][] arrB = inputMatrix(scanner,rowB,colB,"B");
            //Tinh tong hai ma tran
            int [][] arrC = addMatrix(arrA,arrB,colA,rowA);
            //In ket qua
            System.out.println("Tong cua hai ma tran la: ");
            printMatrix(arrC,rowA,colA);
        }
    }
    //Nhap do dong so cot cua ma tran
    public static int[] inputDimension(Scanner scanner, String name){
        //Khoi tao mot mang luu kich thuoc so hang va so cot
        int[] dimension = new int[2];
        System.out.print("Nhap so hang cua ma tran " + name + ": ");
        dimension[0] = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap so cot cua ma tran " + name + ": ");
        dimension[1] = Integer.parseInt(scanner.nextLine());
        return dimension;
    }
    //Kiem tra kich thuoc cua hai ma tran
    public static boolean checkDimension(int rowA, int colA, int rowB,int colB){
        return rowA == rowB && colA == colB;
    }
    //Nhap ma tran
    public static int[][] inputMatrix(Scanner scanner, int row, int col, String name){
        int [][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Moi ban nhap arr cua ma tran "+ name +"[" + i + "][" + j + "]: ");
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        return matrix;
    }
    //Tinh tong hai ma tran
    public static int[][] addMatrix(int[][] arrA, int[][] arrB, int col, int row){
        int [][] arrC = new int[row][col];
        for (int i =0; i < row; i++){
            for (int j = 0; j < col; j++){
                arrC[i][j] = arrA[i][j] + arrB[i][j];
            }
        }
        return arrC;
    }
    //In ket qua tong hai ma tran
    public static void printMatrix(int [][] matrix, int row, int col){
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

}


