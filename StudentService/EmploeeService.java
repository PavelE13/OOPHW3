package StudentService;

import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class EmploeeService {
    private int count;
    private List<Emploee> emploees;

    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }

    public List<Emploee> getAll() {
        return emploees;
    }
    public void create(String firstName, String secondName, int age) {
        Emploee per = new Emploee(firstName, secondName, age, count);
        count++;
        emploees.add(per);
    }
    public List<Emploee> getSortedByFIOStudentGroup(int numberGroup){
        List<Emploee> emploeeList = new ArrayList<>(emploees);
        emploeeList.sort(new UserComparator<Emploee>());
        return  emploeeList;
    }
}
