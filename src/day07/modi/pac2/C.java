package day07.modi.pac2;

import day07.modi.pac1.A;
//import day07.modi.pac1.B;

public class C {

    void test() {

        A a = new A(100); // public
//        new A(3.14); // default
//        new A(false); // private

        a.f1 = 10; // public
//        a.f2 = 20; // default
//        a.f3 = 30; // private

        a.m1();
//        a1.m2();
//        a1.m3();

//        new B();
    }
}
