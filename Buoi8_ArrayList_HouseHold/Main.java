package Buoi8_ArrayList_HouseHold;

import Buoi8_ArrayList_HouseHold.entities.HouseHold;
import Buoi8_ArrayList_HouseHold.service.HouseholdService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HouseholdService householdService = new HouseholdService();
        //Nhap thong tin
        HouseHold houseHold = householdService.inputHousehold(scanner);
        //In thong tin
        System.out.println("Thong tin chi tiet: ");
        householdService.displayInfo(houseHold);
    }
}
