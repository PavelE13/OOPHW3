import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.*;

public class App {
    public static void main(String[] args) throws Exception {
        // User u1 = new User("Сергей","Иванов",25);
        // Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        // Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        // Student s3 = new Student("Иван", "Петров", 22, (long)121);
        // Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        // Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        // Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);

        // List<Student> listStud = new ArrayList<Student>();
        // listStud.add(s1);
        // listStud.add(s2);
        // listStud.add(s3);
        // listStud.add(s4);
        // listStud.add(s5);
        // listStud.add(s6);

        // StudentGroup group = new StudentGroup(listStud);

        // for(Student stud : group)
        // {
        //     System.out.println(stud);
        // }

        // System.out.println("============= после сортировки =============");
        // Collections.sort(group.getStudents());


        // for(Student stud : group)
        // {
        //     System.out.println(stud);
        // }
        Student s1 = new Student("Сергей", "Иванов", 21, (long)101);
        Student s2 = new Student("Андрей", "Сидоров", 19, (long)111);
        Student s3 = new Student("Иван", "Петров", 22, (long)121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        Student s6 = new Student("Лена", "Незабудкина", 19, (long)104);
        Student s7 = new Student("Юля", "Незабудкина", 20, (long)105);
        Student s8 = new Student("Таня", "Незабудкина", 23, (long)106);
        Student s9 = new Student("Галя", "Незабудкина", 21, (long)107);

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s3);
        listStud2.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s7);
        listStud3.add(s8);
        listStud3.add(s9);

        StudentGroup group1 = new StudentGroup(listStud1);
        StudentGroup group2 = new StudentGroup(listStud2);
        StudentGroup group3 = new StudentGroup(listStud3);
        List<StudentGroup> totalcourse = new ArrayList<>();
        totalcourse.add(group1);
        totalcourse.add(group2);
        totalcourse.add(group3);

        StudentSteam course = new StudentSteam(totalcourse);
        //System.out.println("++++++++++++после сортировки++++++++++++++++++++");
        //Collections.sort(group.getStudents());

        for (StudentGroup i:  course) {
                System.out.println(i.getStudents());
        }
        //System.out.println("++++++++++++после сортировки++++++++++++++++++++");
        Collections.sort(course.getStudgrps());

        for (StudentGroup i:  course) {
            System.out.println(i.getStudents());
        }
        //System.out.println(u1);
        //System.out.println(s1);

    }
}
