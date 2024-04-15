package HomeWorks.hw_11;

/**
 * Задание 1: Создание и сравнение класса "Книга"
 * Создайте класс Book с полями title (название), author (автор) и yearOfPublication (год публикации).
 * Поля должны быть приватными, а доступ к ним осуществляться через геттеры и сеттеры.
 * Переопределите метод equals() таким образом, чтобы две книги считались равными, если у них совпадают название и автор.
 * Игнорируйте год публикации при сравнении.
 * Переопределите метод hashCode() в соответствии с реализацией equals(), чтобы гарантировать, что равные объекты имеют
 * одинаковый хеш-код.
 * Переопределите метод toString(), чтобы он возвращал строку с полной информацией о книге (название, автор, год публикации).
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J. Rolling", 2000);

        Book book2 = new Book("Harry Potter", "J. Rolling", 2001);

        if (book1.equals(book2)) {
            System.out.println("Книги равны");
        } else {
            System.out.println("Книги не равны");
        }

        System.out.println(book1);
        System.out.println(book2);

    }
}