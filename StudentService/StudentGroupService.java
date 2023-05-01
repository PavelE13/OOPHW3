package StudentService;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

/** Сервис Класс StudentGroup*/
public class StudentGroupService {
    /**поле список групп студентов*/
    private List<StudentGroup> groups;

    /**Конструктор*/
    public StudentGroupService(){
        this.groups = new ArrayList<>();
    }

    /**Геттер StudentGroup*/
    public List<StudentGroup> getAll() {
        return this.groups;
    }
    /**Сортировка студентов по имени*/
    public List<Student> getSortedByFIOStudentGroup(int numberGroup){
        List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
        students.sort(new UserComparator<Student>());
        return  students;
    }
}
