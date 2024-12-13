package Buoi8_ArrayList_Tiktok;

import Buoi8_ArrayList_Tiktok.entities.Tiktok;

import Buoi8_ArrayList_Tiktok.service.FollowerService;
import Buoi8_ArrayList_Tiktok.service.IdolService;
import Buoi8_ArrayList_Tiktok.service.SongService;
import Buoi8_ArrayList_Tiktok.service.TiktokService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IdolService idolService = new IdolService();
        SongService songService = new SongService();
        FollowerService followerService = new FollowerService();
        TiktokService tiktokService = new TiktokService();


        Tiktok tiktok = tiktokService.inputTiktok(scanner,songService,idolService,followerService);

        System.out.println("Hien thi thong tin chi tiet: ");
        System.out.println(tiktok);


    }
}
