package StudentDomen;

/**Создаем класс учитель- наследник User*/
public class Teacher extends User {
    /**поле epmid*/
    private int teacherId;
    /**поле academicDegree*/
    private String academicDegree;

    /**Конструктор
     * @param firstName
     * @param secondName
     * @param age
     * @param teacherId
     * @param academicDegree
     */

    public Teacher(String firstName, String secondName, int age, int teacherId, String academicDegree ) {
        super(firstName, secondName, age);
        this.teacherId = teacherId;
        this.academicDegree = academicDegree;
    }

    /**Геттер поля teacher*/
    public int getTeacherId() {
        return teacherId;
    }
    /**Сеттер поля teacher*/
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    /**Геттер поля academicDegree*/
    public String getAcademicDegree() {
        return academicDegree;
    }
    /**Сеттер поля academicDegree*/
    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }
    /**переопределение вывода*/
    public String toString() {

        return "Teacher{"

                + "firstName=" + super.getFirstName()
                + ", secondName=" + super.getSecondName()
                + ", age=" + super.getAge() +
                ", teacherId=" + teacherId +
                ", academicDegree=" + academicDegree +
                '}';
    }
}
