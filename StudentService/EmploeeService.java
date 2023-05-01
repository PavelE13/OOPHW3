package StudentService;

import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

/**Создаем сервис класс работник*/
public class EmploeeService {
    /**поле счетчик*/
    private int count;
    /**поле список работников*/
    private List<Emploee> emploees;

    /**конструктор*/
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }

    /**Геттер поля списка emploees*/
    public List<Emploee> getAll() {
        return emploees;
    }
    /**Метод создания массива с уникальным №*/
    public void create(String firstName, String secondName, int age) {
        Emploee per = new Emploee(firstName, secondName, age, count);
        count++;
        emploees.add(per);
    }
    /**Метод сортировки по ФИО*/
    public List<Emploee> getSortedByFIOStudentGroup(int numberGroup){
        List<Emploee> emploeeList = new ArrayList<>(emploees);
        emploeeList.sort(new UserComparator<Emploee>());
        return  emploeeList;
    }
}
