package Controllers;

import StudentDomen.Emploee;
import StudentDomen.User;
import StudentService.EmploeeService;

/**Создаем класс контролер для Работника с имплементацией интерфейса*/
public class EmploeeController implements iUserController<Emploee> {
    /**поле empService экземпляра EmploeeService*/
    private final EmploeeService empService = new EmploeeService();

    /**перегрузка метода create*/
    @Override
    public void create(String firstName, String secondName, int age) {
        empService.create(firstName, secondName, age);
    }

    /**статический метод дженерик вывода зарплаты для работника*/
    static public <T extends Emploee> void paySalary(T person)
    {
        System.out.println(((User) person).getFirstName() + " зп 10000р ");
    }

    /**статический метод дженерик вычиследние среднего арифметического в передаваемом массиве*/
    static public <T extends Number> Double mean(T[] num)
    {
        double sum = 0.0;
        for(int i =0; i<num.length;i++)
        {
            sum= sum+num[i].doubleValue();
        }
        sum=sum/num.length;
        return sum;
    }
}