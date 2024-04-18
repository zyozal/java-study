package day08.static_.Practice2;

public class Store {
    private static int totalSales;

    public void addSale(int amount) {
        totalSales += amount;
    }
    public static String getTotalSales() {
        return totalSales;
    }
}
