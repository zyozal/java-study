package day07.player;

public class Hunter extends Player {

    int concentration; // 집중력

    public Hunter(String nickname) {
        super(nickname);
        this.concentration = 10;
    }

    public void showStatus() {
        super.showStatus();
        System.out.println("# concentration: " + this.concentration);
    }

    public void multipleArrow() {
        System.out.printf("DASH 스킬을 사용합니다.");
    }
}
