package day07.encap;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("그랜저");

        myCar.startStop();

        // 속도 0~200km로 만 제한
//        myCar.speed = -500;
        myCar.setSpeed(66);
        System.out.println("현재 속도: " + myCar.getSpeed() + "km/h");

        // 변속 모드
        myCar.setMode('X');
        System.out.println("현재 변속 모드: " + myCar.getMode());
    }
}
