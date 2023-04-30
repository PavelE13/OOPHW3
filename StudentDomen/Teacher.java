package StudentDomen;

public class Teacher extends User {

    private int teacherId;
    private String academicDegree;

    public Teacher(String firstName, String secondName, int age, int teacherId, String academicDegree ) {
        super(firstName, secondName, age);
        this.teacherId = teacherId;
        this.academicDegree = academicDegree;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Override
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
