package StudentService;

import StudentDomen.User;

import java.util.List;

public class AverageAge <T extends User> {
    private List<T> list;

    public AverageAge(List<T> list) {
        this.list = list;
    }
    public double getAverageAge() {
        double sum = 0;
        for (T person : list) {
            sum += person.getAge();
        }
        return sum / list.size();
    }
}
