package day08.singleton;

public class Main {
    public static void main(String[] args) {

        MyPet m1 = MyPet.getInstance();
        MyPet m2 = MyPet.getInstance();
        MyPet m3 = MyPet.getInstance();

        m1.setName("초코");
        System.out.println("m1 = " + m2);
        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);

    }
}
