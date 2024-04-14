package lessons.objectClass;

public class Main {
    public static void main(String[] args) {
        Person ivan = new Person("ivan", 40);
        Person oleg = new Person("ivan", 41);
        if(ivan.getClass().equals(Person.class)){
            System.out.println("это класс персон");
        }

        if (ivan.equals(oleg)){    // даже если бы 2 объекта были бы одинаковыми, всеровно результат будет один
            System.out.println("они одинаковые");
        } else {
            System.out.println("разные");
        }


    }
}
