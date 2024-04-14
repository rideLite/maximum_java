package HomeWorks.hw_11_part3;

import java.util.List;

public class Swap {
    public static <T> void swap(List<T> values, int index1, int index2) {
        T temp = values.get(index1);
        values.set(index1, values.get(1));
        values.set(index2, temp);
    }
}
