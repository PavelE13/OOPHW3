package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**Класс Хранение списка студентов
 */
    public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    /**поле список студентов*/
    private List<Student> students;

    /**Конструктор
     * @param students
     */
        public StudentGroup(List<Student> students) {
            this.students = students;
        }

    /**Геттер
     * @return список студентов
     */
        public List<Student> getStudents() {
            return students;
        }

    /**Сеттер
     * @param students
     */
        public void setStudents(List<Student> students) {
            this.students = students;
        }

        // @Override
        // public Iterator<Student> iterator() {
        //     return new StudentGroupIterator(students);
        // }

    /**Переопределение метода итератора по студенту
     * @return
     */
        @Override
        public Iterator<Student> iterator() {
            return new Iterator<Student>(){
                private int index = 0;
                @Override
                public boolean hasNext() {
                    return index<students.size();
                }
                @Override
                public Student next() {
                    if(!hasNext())
                    {
                        return null;
                    }
                    //counter++;
                    return students.get(index++);
                }

            };
        }

    /**Переопределение компаратора для StudentGroup
     * @param o the object to be compared.
     * @return Integer (-1.0.1)
     */
        @Override
        public int compareTo(StudentGroup o) {
            return Integer.compare(students.size(),o.students.size());

        }
    }
