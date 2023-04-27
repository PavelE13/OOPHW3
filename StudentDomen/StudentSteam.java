package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**Метод поток студентов с имплементацией Студентгрупп*/
public class StudentSteam implements Iterable<StudentGroup> {
    /**поле список группа студентов*/
    private List<StudentGroup> studgrps;
    //private int groupn;

    /**Конструктор
     * @param studgrps
     */
    public StudentSteam(List<StudentGroup> studgrps/*, int groupn*/) {
        this.studgrps = studgrps;
        //this.groupn = groupn;
    }
/*    public int getgroupn() {
        return groupn;
    }

    public void setGroupn(int groupn) {
        this.groupn = groupn;
    }*/

    /**Геттер
     * @return список групп
     */
    public List<StudentGroup> getStudgrps() {
        return studgrps;
    }

    /**Сеттер
     * @param studgrps
     */
    public void setStudgrps(List<StudentGroup> studgrps) {
        this.studgrps = studgrps;
    }

    /**Переопределение метода итератор
     * @return
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            /**Переопределение метода итератора hasNext
             * @return
             */
            @Override
            public boolean hasNext() {
                return index < studgrps.size();
            }

            /**Переопределение метода итератора next
             * @return
             */
            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                //counter++;
                return studgrps.get(index++);
            }
        };
    }

}
