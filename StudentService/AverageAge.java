package StudentService;

import StudentDomen.User;

import java.util.List;

/**Клас дженерик расчета среденго возраста*/
public class AverageAge <T extends User> {
    /** создаем параметризированный список*/
    private List<T> list;

    /**Конструктор
     * @param list
     */
    public AverageAge(List<T> list) {
        this.list = list;
    }

    /**Метод расчета среднего возраста*/
    public double getAverageAge() {
        double sum = 0;
        for (T person : list) {
            sum += person.getAge();
        }
        return sum / list.size();
    }
}
