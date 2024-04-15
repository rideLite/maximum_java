package HomeWorks.hw_11_part2;


/**
 * Задание 2: Создание обобщенного класса хранилища
 * Создайте обобщенный класс Storage<T>, который может хранить объекты заданного типа T.
 * Класс должен предоставлять следующие методы:
 * <p>
 * void add(T item) для добавления элемента в хранилище.
 * T get(int index) для получения элемента по индексу.
 * int size() для получения размера хранилища.
 */
public class Main {
    public static void main(String[] args) {
        Storage<String> storage = new Storage<>();
        storage.add("xyzzyy");
        storage.get(0);
        System.out.println(storage.size());
    }
}

