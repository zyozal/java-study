package day07.inherit.practice;

public class ElectronicProduct {

    String productName;
    double price;
    String manufacturer;

    void displayInfo() {
        System.out.printf("%s, 가격: %.0f원, 제조사: %s\n",
                this.productName, this.price, this.manufacturer);
    }
//      System.out.println(this.productName + " 가격: " + this.price + " 제조사: " + this.manufacturer);

}
