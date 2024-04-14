package lessons.exeption;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String text = "пишем в файл";
        FileWriter writer =null;

        try {
            writer = new FileWriter("text.txt", true);
            writer.write("текст для записи в файл");
            System.out.println("done!");
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            writer.close();
        }
    }
}
