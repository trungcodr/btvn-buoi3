package Buoi8_ArrayList_TechMaster.service;

import Buoi8_ArrayList_TechMaster.Entites.Classroom;
import Buoi8_ArrayList_TechMaster.Entites.TechMaster;

import java.util.Scanner;

public class TechmasterService {
    public TechMaster inputTechMaster(Scanner scanner, ClassroomService classroomService, StudentService studentService){
        System.out.print("Nhap ten nguoi quan ly lop hoc: ");
        String manager = scanner.nextLine();
        System.out.print("Nhap ten giang vien: ");
        String teacher = scanner.nextLine();
        System.out.println("Nhap thong tin chi tiet lop hoc");
        Classroom classroom = classroomService.inputClassroom(scanner,studentService);
        return new TechMaster(manager,teacher,classroom);
    }
    public void showInfoTechmaster(TechMaster techMaster){
        System.out.println(techMaster);
    }


}
