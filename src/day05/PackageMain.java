package day05;

// 다른 패키지에 있는 클래스를 로딩할 때 이름을 축약해서 쓰기위해 사용
//import day05.juice.Apple;
//import day05.juice.Banana;
import day05.juice.*;

public class PackageMain {
    public static void main(String[] args) {

        Apple a1 = new Apple();
        new Banana();
        new Peach();

    }
}
