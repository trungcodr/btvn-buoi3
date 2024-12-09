package Buoi6_Abstract_TechmasterStudent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong sinh vien: ");
        int numberStudent = Integer.parseInt(scanner.nextLine());

        //Khai bao mang de luu 2 loai sinh vien it va biz
        TechmasterStudent[] techmasterStudent = new TechmasterStudent[numberStudent];
        for (int i = 0; i<numberStudent;i++){
            System.out.println("Nhap thong tin cho sinh vien thu " + (i+1)+ ": ");
            System.out.print("Sinh vien(IT/Biz): ");
            String typeStudent = scanner.nextLine();

            System.out.print("Nhap ten sinh vien: ");
            String name = scanner.nextLine();
            System.out.print("Chuyen nganh sinh vien: ");
            String major = scanner.nextLine();

            if (typeStudent.equalsIgnoreCase("IT")){
                System.out.print("Nhap diem Java: ");
                double scoreJava = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhap diem HTML: ");
                double scoreHTML = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhap diem CSS: ");
                double scoreCSS = Double.parseDouble(scanner.nextLine());
                //Them sinh vien it vao mang sinh vien techmaster (Upcasting)
                techmasterStudent[i] = new StudentIT(name,major,scoreJava,scoreHTML,scoreCSS);
            } else if (typeStudent.equalsIgnoreCase("Biz")) {
                System.out.print("Nhap diem Marketing: ");
                double scoreMarketing = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhap diem Sales: ");
                double scoreSales = Double.parseDouble(scanner.nextLine());
                //Them sinh vien biz vao mang sinh vien techmaster (Upcasting)
                techmasterStudent[i] = new StudentBiz(name,major,scoreMarketing,scoreSales);
            } else{
                System.out.println("Nhap khong hop le, xin vui long nhap lai!");
                //quay lai nhap sinh vien o vi tri thu i!
                i--;
            }

        }
        //Xuat thong tin ra man hinh
        System.out.println("-----------------****---------------------");
        System.out.println("Thong tin sinh vien Techmaster");
        for (int i =0;i<techmasterStudent.length;i++){
            if (techmasterStudent!= null){
                techmasterStudent[i].display();
                System.out.println("-------------------------------------");
            }
        }
    }
}
