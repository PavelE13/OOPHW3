package StudentDomen;

public class Emploee extends  User {
    private int epmid;
    public Emploee(String finstName, String secondName, int age, int epmid) {
        super(finstName, secondName, age);
        this.epmid = epmid;
    }


    public int getEpmid() {
        return epmid;
    }

    public void setEpmid(int epmid) {
        this.epmid = epmid;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
