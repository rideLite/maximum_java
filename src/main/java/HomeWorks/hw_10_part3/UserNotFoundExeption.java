package HomeWorks.hw_10_part3;
/**3) Создание собственного исключения

 Создайте собственное checked исключение UserNotFoundException, которое должно выбрасываться,
 когда поиск пользователя по идентификатору не увенчался успехом.
 Напишите метод findUserById, который принимает идентификатор пользователя (int) и имитирует поиск пользователя:
 если переданный идентификатор меньше 0, метод должен выбрасывать UserNotFoundException.
 В методе, который вызывает findUserById, обработайте исключение, выводя сообщение о том, что пользователь не найден.*/
public class UserNotFoundExeption extends Exception{
    public UserNotFoundExeption (String message){
        super(message);
    }
}
