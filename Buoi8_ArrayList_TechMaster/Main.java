package Buoi8_ArrayList_TechMaster;

import Buoi8_ArrayList_TechMaster.Entites.TechMaster;
import Buoi8_ArrayList_TechMaster.service.ClassroomService;
import Buoi8_ArrayList_TechMaster.service.StudentService;
import Buoi8_ArrayList_TechMaster.service.TechmasterService;

import javax.swing.text.Style;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TechmasterService techmasterService = new TechmasterService();
        ClassroomService classroomService = new ClassroomService();
        StudentService studentService = new StudentService();
        //Nhap thong tin trung tam
        TechMaster techMaster = techmasterService.inputTechMaster(scanner,classroomService,studentService);

//        System.out.println("Hien thi thong tin chi tiet: ");
//        System.out.println(techMaster);

        while (true){
            System.out.println("--------------Danh sach Menu--------------");
            System.out.println("1- Hiển thị thông tin chi tiết của trung tâm\n" +
                    "2- Thực hiện thêm học viên vào lớp hiện tại\n" +
                    "3- Thực hện cập nhật thông tin học lực của 1b học viên dựa vào Id\n" +
                    "4- Có 1 bạn xin nghỉ học, hãy giúp thầy xóa bạn đó khỏi lớp học\n" +
                    "5- Ket thuc chuong trinh!");
            System.out.print("Moi ban nhap lua chon: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println();
                    techmasterService.showInfoTechmaster(techMaster);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh!");
                    return;
            }

        }
    }
}
