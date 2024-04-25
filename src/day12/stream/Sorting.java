package day12.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static day12.stream.Menu.menuList;

public class Sorting {
    public static void main(String[] args) {

        List<Dish> dishList = menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .sorted(Comparator.comparing(Dish::getCalories))
                .collect(Collectors.toList());

        menuList.stream()
                .sorted(Comparator.comparing(Dish::getName).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<Dish> dishList1 = menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .sorted(Comparator.comparing(Dish::getCalories))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(dishList1);
    }
}
