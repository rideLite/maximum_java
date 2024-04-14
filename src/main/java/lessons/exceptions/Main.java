package lessons.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            readFile("text.txt");
        } catch (FileNotFoundException e) {
            System.out.println("exeptionnnnnnnnnnnnnn"+ e.getMessage());        }
    }
   static void  readFile(String path) throws FileNotFoundException{
           FileReader fileReader = new FileReader(path);
       System.out.println("файл открыт");
   }

}
