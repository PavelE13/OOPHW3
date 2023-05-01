package StudentService;

import java.util.List;

/**Создаем интерфейс дженерик*/
public interface iUserService<T> {
    /**поле параметризированный список*/
    List<T> getAll();
    /**поле метод create*/
    void create(String firstName, String secondName, int age);
}
