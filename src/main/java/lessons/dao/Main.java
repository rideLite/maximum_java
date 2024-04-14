package lessons.dao;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        PersonDao personDao = new FilePersonDao("text.txt");
        Person person1 = new Person("Oleg",30);
        Person person2 = new Person("Vasya",30);
        personDao.addPerson(person1);
        personDao.addPerson(person2);

    }
}
