package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**Класс StudentGroupIterator с имплементацией Iterator
 */
public class StudentGroupIterator implements Iterator {
    /**поле счетчик*/
    private  int counter;
    /**поле список студентов*/
    private final List<Student> students;
    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }
    /**переопределяем метод итератора hasNext*/
    @Override
    public boolean hasNext() {
        return counter<students.size();
    }
    /**переопределяем метод итератора next*/
    @Override
    public Student next() {
        if(!hasNext())
        {
            return null;
        }
        //counter++;
        return students.get(counter++);
    }
}
