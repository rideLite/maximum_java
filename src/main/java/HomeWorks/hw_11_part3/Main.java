package HomeWorks.hw_11_part3;

import java.util.ArrayList;
import java.util.List;

/**
 * Задание 3: Реализация обобщенного метода
 * Реализуйте статический обобщенный метод swap,
 * который принимает список любого типа и два индекса,
 * и меняет местами элементы, находящиеся в этих индексах.
 * Протестируйте метод на списках различных типов (например, Integer и String).
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Aaa");
        list.add("Bbb");
        list.add("Ccc");
        System.out.println("String type. Before swap:: " + list);
        Swap.swap(list, 0, 1);
        System.out.println("After swap" + list);


        List<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(22);
        list2.add(33);
        System.out.println("Integer type. Before swap:: " + list2);
        Swap.swap(list2, 0, 1);
        System.out.println("After swap" + list2);


    }
}

