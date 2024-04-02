package HomeWorks.hw_10_part4;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String sourcePath = "source.txt";
        String targetPath = "target.txt";

        try {
            copyFileContent(sourcePath, targetPath);
            System.out.println("Содержимое файла успешно записано!");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    public static void copyFileContent(String sourcePath, String targetPath) throws IOException {

        // Чтение из файла и запись в файл
        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(targetPath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found: " + e.getMessage());
        } catch (IOException e) {
            throw new IOException("Error reading/writing file: " + e.getMessage());
        }
    }
}