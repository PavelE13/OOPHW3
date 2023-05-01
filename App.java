import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Controllers.TeacherController;
import StudentDomen.*;
import StudentService.AverageAge;
import StudentService.TeacherService;

/** Программа StusentServiceApp ver2.0*/

public class App {
    public static void main(String[] args) throws Exception {
        ///**Создаем студентов*/
        // Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        // Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        // Student s3 = new Student("Иван", "Петров", 22, (long)121);
        // Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        // Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        // Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);

        ///**формируем список поступивших студентов*/
        // List<Student> listStud = new ArrayList<Student>();
        // listStud.add(s1);
        // listStud.add(s2);
        // listStud.add(s3);
        // listStud.add(s4);
        // listStud.add(s5);
        // listStud.add(s6);

        ///**Резервируем память под группы студентов и записываем список студентов*/
        // StudentGroup group = new StudentGroup(listStud);

        ///**Выводим в цикле список студентов*/
        // for(Student stud : group)
        // {
        //     System.out.println(stud);
        // }

        ///**Сортируем по ID студента и выводим в цикле отсортированный список студентов*/
        // System.out.println("============= после сортировки =============");
        // Collections.sort(group.getStudents());

        // for(Student stud : group)
        // {
        //     System.out.println(stud);
        // }

        ///**Создаем студентов*/
        //Student s1 = new Student("Сергей", "Иванов", 21, (long)101);
        //Student s2 = new Student("Андрей", "Сидоров", 19, (long)111);
        //Student s3 = new Student("Иван", "Петров", 22, (long)121);
        //Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        //Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        //Student s6 = new Student("Лена", "Незабудкина", 19, (long)104);
        //Student s7 = new Student("Юля", "Незабудкина", 20, (long)105);
        //Student s8 = new Student("Таня", "Незабудкина", 23, (long)106);
        //Student s9 = new Student("Галя", "Незабудкина", 21, (long)107);

        ///**Распределяем студентов по группам*/
        //List<Student> listStud1 = new ArrayList<Student>();
        //listStud1.add(s1);
        //listStud1.add(s2);
        //List<Student> listStud2 = new ArrayList<Student>();
        //listStud2.add(s3);
        //listStud2.add(s4);
        //listStud2.add(s5);
        //listStud2.add(s6);
        //List<Student> listStud3 = new ArrayList<Student>();
        //listStud3.add(s7);
        //listStud3.add(s8);
        //listStud3.add(s9);

        ///**Распределяем студентов по группам (курсам)*/
        //StudentGroup group1 = new StudentGroup(listStud1);
        //StudentGroup group2 = new StudentGroup(listStud2);
        //StudentGroup group3 = new StudentGroup(listStud3);
        //List<StudentGroup> totalcourse = new ArrayList<>();
        //totalcourse.add(group1);
        //totalcourse.add(group2);
        //totalcourse.add(group3);

        ///**Резервируем память под курсы студентов и записываем список студентов на курсы*/
        //StudentSteam course = new StudentSteam(totalcourse);

        ///**Выводим в цикле список студентов*/
        //for (StudentGroup i:  course) {
        //        System.out.println(i.getStudents());
        //}

        ///**Сортируем по ID студента и выводим в цикле отсортированный список студентов с привязкой к курсу*/
        //System.out.println("++++++++++++после сортировки++++++++++++++++++++");
        //Collections.sort(course.getStudgrps());

        //**Выводим в цикле отсортированный список учетилей*/
        //for (StudentGroup i:  course) {
        //    System.out.println(i.getStudents());
        //}

        //**Создаем работника*/
        //Emploee peron1 = new Emploee("Иванов", "Олег", 55, 110);
        ///**Создаем студента*/
        //Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        ///**Создаем экземпляр контроллера Employee*/
        //EmploeeController contrEmp = new EmploeeController();
        ///**Вызываем метод public на экземпляре contrEmp paySalary person1 (заплатить зп)*/
        //EmploeeController.paySalary(peron1);
        ///**Вызываем метод private на экземпляре contrEmp paySalary person1 (заплатить зп)*/
        //contrEmp.paySalary(peron1);
        ///**Код - блокирование выплаты зп студенту*/
        //contrEmp.paySalary(s1);

        ///**Вывод*/
        //Integer studHour[]  = {124,234,231,1,45};
        //System.out.println(EmploeeController.mean(studHour));
        //Double emplSalary[] = {12555.23,34213.5,10000.0};
        //System.out.println(EmploeeController.mean(emplSalary));

        /**Вывод по дз*/

        /**Создаем учителей*/
        Teacher t1 = new Teacher("Иван", "Олежа", 45, 1, "доткор философии");
        Teacher t2 = new Teacher("Петр", "Проскурин", 44, 2, "доткор математики");
        Teacher t3 = new Teacher("Иван", "Королев", 35, 3, "магистр физики");
        Teacher t4 = new Teacher("Дмитрий", "Городов", 37, 4, "доткор химии");
        Teacher t5 = new Teacher("Иван", "Москвин", 45, 5, "доткор философии");
        Teacher t6 = new Teacher("Сергей", "Прунов", 35, 6, "доктор математики");

        /**Создаем работников*/
        Emploee e1 = new Emploee("Денис", "Солоков", 45, 1);
        Emploee e2 = new Emploee("Петр", "Голгофа", 38, 2);
        Emploee e3 = new Emploee("Юрий", "Юрочкин", 25, 3);
        Emploee e4 = new Emploee("Геннадий", "Кныш", 39, 4);
        Emploee e5 = new Emploee("Дамир", "Сайфулин", 43, 5);

        /**Создаем студентов*/
        Student s1 = new Student("Сергей", "Иванов", 21, (long)101);
        Student s2 = new Student("Андрей", "Сидоров", 19, (long)111);
        Student s3 = new Student("Иван", "Петров", 22, (long)121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        Student s6 = new Student("Лена", "Незабудкина", 19, (long)104);

        /**Создание экземпляра списка Teacher*/
        List<Teacher> teach = new ArrayList<Teacher>();
        teach.add(t1);
        teach.add(t2);
        teach.add(t3);
        teach.add(t4);
        teach.add(t5);
        teach.add(t6);

        /**Создание экземпляра списка Emploee*/
        List<Emploee> emploeeList = new ArrayList<Emploee>();
        emploeeList.add(e1);
        emploeeList.add(e2);
        emploeeList.add(e3);
        emploeeList.add(e4);
        emploeeList.add(e5);

        /**Создание экземпляра списка Student*/
        List<Student> stud = new ArrayList<Student>();
        stud.add(s1);
        stud.add(s2);
        stud.add(s3);
        stud.add(s4);
        stud.add(s5);
        stud.add(s6);


        /**Выводим в цикле список учетилей*/
        for (Teacher i:  teach) {
            System.out.println(i);

        }

        /**Сортируем по возрасту учителей и выводим в цикле отсортированный список*/
        System.out.println("++++++++++++после сортировки++++++++++++++++++++");
        TeacherService teacherService = new TeacherService();
        teacherService.getSortedByFIOTeacher(teach);

        /**Выводим в цикле отсортированный список учетилей*/
        for (Teacher i:  teach) {
            System.out.println(i);
        }

        /**Создаем экземпляр AverageAgeTeach, отправляя дженерику тип Teacher*/
        AverageAge<Teacher> averageAgeTeach = new AverageAge<>(teach);
        /**Вывод среднего возраста по подсчету метода getAverageAge*/
        System.out.println("Средний возраст учителей: " + averageAgeTeach.getAverageAge());

        /**Создаем экземпляр AverageAgeStud, отправляя дженерику тип Student*/
        AverageAge<Student> averageAgeStud = new AverageAge<>(stud);
        /**Вывод среднего возраста по подсчету метода getAverageAge*/
        System.out.println("Средний возраст студентов: " + averageAgeStud.getAverageAge());

        /**Создаем экземпляр AverageAgeEmploee, отправляя дженерику тип Emploee*/
        AverageAge<Emploee> averageAgeEmploee = new AverageAge<>(emploeeList);
        /**Вывод среднего возраста по подсчету метода getAverageAge*/
        System.out.println("Средний возраст работников: " + averageAgeEmploee.getAverageAge());
    }
}
