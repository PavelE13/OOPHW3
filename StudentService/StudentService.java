package StudentService;

import StudentDomen.Student;

import java.util.List;
import java.util.ArrayList;

/** Сервис Класс StudentService c имплементацией интерфейса по типу Студент*/
public class StudentService implements iUserService<Student>{
    /**поле счетчик*/
    private int count;
    /**поле список студентов*/
    private List<Student> students;

    /**Конструктор*/
    public StudentService(){
        this.students = new ArrayList<Student>();
    }

    /**Геттер список студентов
     * @return students
     */
    public List<Student> getAll() {
        return students;
    }

    /**перегрузка метода create
     * @param firstName
     * @param secondName
     * @param age
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        Student per = new Student(firstName, secondName, age, count);
        count++;
        students.add(per);
    }
}
