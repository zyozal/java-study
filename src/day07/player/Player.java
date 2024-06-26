package day07.player;

import java.util.Scanner;


public class Player {

    String nickname;
    int level;
    int hp;

    Player(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
    }

    // 현재 캐릭터 정보를 출력
    public void showStatus() {
        System.out.println("\n======= Character's Info ========");
        System.out.println("# name: " + this.nickname);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);
    }
}
