package Controllers;

import StudentDomen.Student;
import StudentService.StudentGroupService;
import StudentService.StudentService;

/**Класс контроллер для студента с имплементацией интерфейса-дженерика UserController*/
public class StudentController implements iUserController<Student>{
    /**Создаем экземпляр класса StudentService dataService*/
    private final StudentService dataService = new StudentService();
    /**Создаем экземпляр класса StudentGroupService groupService*/
    private final StudentGroupService groupService = new StudentGroupService();
    /**Метод create с вызовом экземпляра класса StudentService*/
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName,age);
    }
}
