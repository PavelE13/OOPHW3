package StudentDomen;

import java.util.Comparator;

/**Класс дженерик компаратор*/
public class UserComparator<T extends  User> implements Comparator<T> {
    /**переопределяем компаратор
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     */
    @Override
    public int compare(T o1, T o2) {
        //int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        //if (resultOfComparing == 0) {
        //    resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        //    return resultOfComparing;
        //}
       // else return resultOfComparing;
        return o1.getAge()-o2.getAge();
    }
}
