package day10.abs;

public abstract class Pet {
    String name;
    int age;
    String kind;

    // 산책 기능은 필요한 객체가 필요에 따라 오버라이딩하는 것이지 모두에게 강요할 필요 없다면 추상화하지 않아도 됨
    public void walk() {}

    // 밥, 잠 기능은 필수기능이니 없으면 객체가 불안정해지므로 강요할 필요가 있으니 추상화
    public abstract void eat();

    // 추상 메서드는 본문이 없는 껍데기 역할(자식들에게 이름을 통일시키기 위한 장치)로만 사용
    // 추상 메서드는 추상 클래스 안에서만 선언 가능
    // 다만 추상 클래스 내부에는 추상 메서드 이외에 모든 메서드 선언 가능
    public abstract void sleep();
}
