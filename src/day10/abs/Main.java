package day10.abs;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        Pet[] petList = {myDog,myCat};
        for (Pet pet : petList) {
            pet.eat();
        }
    }
}
