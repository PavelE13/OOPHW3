package StudentService;

import StudentDomen.Student;
import StudentDomen.Teacher;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iUserService<Teacher> {
    private int count;
    private String academicDegreeString;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher per = new Teacher(firstName, secondName, age, count, academicDegreeString);
        count++;
        teachers.add(per);
    }

    public List<Teacher> getSortedByFIOTeacher(List<Teacher> teacherList) {
        //List<Teacher> teacherList = new ArrayList<>(teachers);
        teacherList.sort(new UserComparator<Teacher>());
        return teacherList;
    }
}
