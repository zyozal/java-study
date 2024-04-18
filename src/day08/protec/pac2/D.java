package day08.protec.pac2;


import day08.protec.pac1.A;

public class D extends A {
    D() {
        super(100);

        super.f1 = 100;

        m1();
    }

    void test() {
        A a = new A();
//        a.f1  = 10; a.f2 = 30;
//        m1(); m2();
    }
}
