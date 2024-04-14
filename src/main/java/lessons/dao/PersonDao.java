package lessons.dao;

public interface PersonDao {
    void addPerson(Person person);
    Person findPerson(String name);
}
