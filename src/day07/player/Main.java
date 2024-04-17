package day07.player;

public class Main {
    public static void main(String[] args) {
        Warrior w = new Warrior("주차왕");
        Mage m = new Mage("충격왕");
        Hunter h = new Hunter("죠");

        w.showStatus();
        m.showStatus();
        h.showStatus();
    }
}
