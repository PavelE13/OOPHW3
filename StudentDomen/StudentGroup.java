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

/*        @Override
        public int compareTo(StudentGroup o) {
            return 0;
        }*/
        @Override
        public int compareTo(StudentGroup o) {
            return Integer.compare(students.size(),o.students.size());
/*            // System.out.println(super.getFirstName() + " - " + o.getFirstName());
            if (students.size() == o.getStudents())) {
                if (this.studentID == o.studentID) {
                    return 0;
                }
                if (this.studentID < o.studentID) {
                    return -1;
                }
                return 1;
            }
            if (super.getAge() < o.getAge()) {
                return -1;
            }
            return 1;*/
        }
    }
