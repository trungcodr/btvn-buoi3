package Buoi8_ArrayList_HouseHold.service;

import Buoi8_ArrayList_HouseHold.entities.HouseHold;
import Buoi8_ArrayList_HouseHold.entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseholdService {
    //Nhap thong tin
    public HouseHold inputHousehold(Scanner scanner){
        System.out.print("Nhap id cua ho dan: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap so nha cua ho dan: ");
        int numHouse = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap so luong thanh vien: ");
        int numMember = Integer.parseInt(scanner.nextLine());

        List<Person> members = new ArrayList<>();
        for (int i = 0;i< numMember;i++){
            System.out.println("Nhap thanh vien thu " + (i+1)+": ");
            System.out.println("Nhap ten thanh vien: ");
            String name = scanner.nextLine();
            System.out.println("Nhap sinh nhat cua thanh vien: ");
            String dob = scanner.nextLine();
            System.out.println("Nhap cong viec cua thanh vien: ");
            String job = scanner.nextLine();

            Person person = new Person(name,dob,job);
            members.add(person);
        }
        return new HouseHold(id,numHouse,members);
    }
    //Hien thi thong tin
    public  void displayInfo(HouseHold houseHold){
        System.out.println(houseHold);
    }

}
