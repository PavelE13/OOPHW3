package StudentService;

import StudentDomen.Student;

import java.util.List;
import java.util.ArrayList;

public class StudentService implements iUserService<Student>{
    private int count;
    private List<Student> students;
    public StudentService(){
        this.students = new ArrayList<Student>();
    }

    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Student per = new Student(firstName, secondName, age, count);
        count++;
        students.add(per);
    }
}
