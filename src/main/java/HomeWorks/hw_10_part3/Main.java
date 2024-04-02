package HomeWorks.hw_10_part3;

/**
 * 3) Создание собственного исключения
 * <p>
 * Создайте собственное checked исключение UserNotFoundException, которое должно выбрасываться,
 * когда поиск пользователя по идентификатору не увенчался успехом.
 * Напишите метод findUserById, который принимает идентификатор пользователя (int) и имитирует поиск пользователя:
 * если переданный идентификатор меньше 0, метод должен выбрасывать UserNotFoundException.
 * В методе, который вызывает findUserById, обработайте исключение, выводя сообщение о том, что пользователь не найден.
 */
public class Main {
    public static void main(String[] args) throws UserNotFoundExeption {
        int userId = -1;
        findUser(userId);
    }

    static void findUser(int userId) throws UserNotFoundExeption {
        if (userId > 0) {
            System.out.println(" User id find, ID :: ");
        } else {
            throw new UserNotFoundExeption("Поиск пользователя по идентификатору не увенчался успехом.");
        }
    }
}




