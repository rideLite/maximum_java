package lessons.dao;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilePersonDao implements PersonDao {
    private Path filePath;

    public FilePersonDao(String fileName) {
        this.filePath = Paths.get(fileName);
    }

    @Override
    public void addPerson(Person person) {
        try (BufferedWriter writer = Files.newBufferedWriter(filePath, StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
            writer.write(person.getName() + ", " + person.getAge());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Person findPerson(String name) {
        return null;
    }
}
