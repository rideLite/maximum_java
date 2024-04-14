package HomeWorks.hw_11_part4;

import java.util.ArrayList;
import java.util.List;

/**
 * Задание 4: Ограничения обобщенных типов
 * Создайте обобщенный метод sumOfList, который принимает List элементов, расширяющих класс Number
 * double sumOfList(List<? extends Number> list),
 * и возвращает их сумму в виде double.
 * Убедитесь, что ваш метод работает как с List<Integer>, так и с List<Double>.
 */

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = List.of(1,6,8,3);
        List<Double> doubleList = List.of(1.5,5.5, 83.0);

        System.out.println("Сумма целых чисел :: "+sumOfList(intList));
        System.out.println("Сумма дробных :: "+sumOfList(doubleList));

    }

    public static double sumOfList(List<? extends Number>list){
        double summa = 0;
       for (Number n:list){
           summa+= n.doubleValue();
       }
       return summa;
    }
}
