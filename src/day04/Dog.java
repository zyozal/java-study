package day04;

public class Dog {

    String dogName;
    int age;
    boolean injection; // 예방접종 유무

    void petInfo() {
        System.out.printf("우리집 강아지는 %s에요 %d살이에요\n", dogName, age);
        if (injection) {
            System.out.println("접종완료");
        } else {
            System.out.println("아직 안함");
        }
    }
    void inject() {
        System.out.printf("%s 강아지에게 주사를 맞혀요\n", dogName);
        injection = true;
    }

    // 생성자
    Dog(String dName) {
        dogName = dName;
        age = 1;
    }
}
