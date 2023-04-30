package Controllers;

import StudentService.TeacherService;
import StudentDomen.Teacher;
import java.util.ArrayList;

public class TeacherController implements iUserController<Teacher> {
    private final TeacherService dataTechService = new TeacherService();

    @Override
    public void create(String firstName, String secondName, int age) {
        dataTechService.create(firstName, secondName, age);
    }
}
