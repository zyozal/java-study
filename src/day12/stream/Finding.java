package day12.stream;

import static day12.stream.Menu.menuList;

public class Finding {
    public static void main(String[] args) {
        boolean flag1 = menuList.stream()
                .anyMatch(d -> d.isVegeterian());
        System.out.println("flag1 = " + flag1);

        boolean flag2 = menuList.stream()
                .anyMatch(d -> d.getCalories() <= 100);
        System.out.println("flag2 = " + flag2);

        boolean flag3 = menuList.stream()
                .allMatch(dish -> dish.getCalories() < 1000);
        System.out.println("flag3 = " + flag3);

    }
}
