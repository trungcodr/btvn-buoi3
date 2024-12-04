package btvn_buoi4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Tinh tong 2 array tach ham
    Scanner scanner = new Scanner(System.in);
        sumArray(scanner);
    }
    //Nhap so
    public static int[] inputArray(Scanner scanner){
        System.out.print("Moi ban nhap vao so nguyen n: ");
        int n = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[n];
        for (int i =0;i< n;i++){
            System.out.print("Moi ban nhap so thu "+(i+1)+": ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        return  arr;
    }
    // Tinh tong cua mang
    public static void sumArray(Scanner scanner){
        int arr[]=inputArray(scanner);
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Tong mang la: "+ sum);
    }
}
