package Controllers;

import StudentService.TeacherService;
import StudentDomen.Teacher;
import java.util.ArrayList;

/**Класс контроллер для студента с имплементацией интерфейса-дженерика UserController*/
public class TeacherController implements iUserController<Teacher> {
    /**Создаем экземпляр класса TeacherService dataTechService*/
    private final TeacherService dataTechService = new TeacherService();

    /**Переопределяем вызов экземпляра класса StudentService*/
    @Override
    public void create(String firstName, String secondName, int age) {
        dataTechService.create(firstName, secondName, age);
    }
}
