package btvn_buoi5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhap chieu dai chieu rong cua hinh chu nhat
        System.out.print("Nhap chieu dai cua hinh chu nhat: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap chieu rong cua hinh chu nhat: ");
        double width = Double.parseDouble(scanner.nextLine());
        //Nhap canh cua hinh vuong
        System.out.print("Nhap canh cua hinh vuong: ");
        double side = Double.parseDouble(scanner.nextLine());
        //Hien thi thong tin hinh chu nhat
        Rectangle rectangle = new Rectangle(length,width);
        System.out.println("Thong tin cua hinh chu nhat: " + rectangle);
        //Hien thi chu vi dien tich cua hcn
        rectangle.showInfo();
        //Hien thi thong tin hinh vuong
        Square square = new Square(side);
        System.out.println("Thong tin cua hinh vuong: " + square);
        // Hien thi chu vi dien tich cua hinh vuong
        square.showInfo();


    }
}
