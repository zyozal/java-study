package day08.final_;

class Child extends Parent{
    @Override
    void sing() {
        System.out.println("노래를 하하하");
    }
//    @Override
//    void dance() {
//        System.out.println("댄스를 랄랄라");
//    }
}
public class Parent {

    void sing() {
        System.out.println("노래를 랄랄라");
    }
    final void dance() {
        System.out.println("댄스는 하하하");
    }
}
