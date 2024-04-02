package HomeWorks.example_of_adapter;

import java.util.Arrays;
import java.util.List;

/**
 2) Реализовать паттерн Адаптер для класса VideoPlayer с методом playAvi() и интерфейса
 MediaPlayer с методом play() - по аналогии с реализацией, показаной на занятии, в отдельном пакете (package)**/
public class Main {
    public static void main(String[] args) {
        BritishPlug BritishPlug = new BritishPlug();

        PlugAdapter plugAdapter = new PlugAdapter(BritishPlug);

        plugAdapter.useEuropeanPlug();


        String[] array = {"One", "Thow", "Three"};
        List<String> strings = Arrays.asList(array);
//        strings.add("new");
        strings.set(0, "newSET");
        System.out.println(Arrays.toString(array));
    }
}
