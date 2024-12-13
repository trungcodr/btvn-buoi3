package Buoi8_ArrayList_Tiktok.service;

import Buoi8_ArrayList_Tiktok.entities.Followers;

import java.util.Scanner;

public class FollowerService {
    public Followers inputFollower(Scanner scanner){
        System.out.print("Nhap ten nguoi theo doi: ");
        String name = scanner.nextLine();
        System.out.print("Nhap id cua nguoi theo doi: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap email cua nguoi theo doi: ");
        String email = scanner.nextLine();
        System.out.print("Nhap so luong luot thich: ");
        int numberOfLike = Integer.parseInt(scanner.nextLine());
        return new Followers(name,id,email,numberOfLike);
    }
}
