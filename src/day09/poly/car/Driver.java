package day09.poly.car;

public class Driver {

    public void drive(Car car) {

        System.out.println(car instanceof Sonata);

        System.out.println("운전 시작");
        car.accelerate();
    }
}
