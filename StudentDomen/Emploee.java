package StudentDomen;

/**Создаем класс работник - наследник User*/
public class Emploee extends  User {
    /**поле epmid*/
    private int epmid;

    /**Конструктор
     * @param finstName
     * @param secondName
     * @param age
     * @param epmid
     */
    public Emploee(String finstName, String secondName, int age, int epmid) {
        super(finstName, secondName, age);
        this.epmid = epmid;
    }

    /**Геттре
     * @return
     */
    public int getEpmid() {
        return epmid;
    }

    /**Сеттер
     * @param epmid
     */
    public void setEpmid(int epmid) {
        this.epmid = epmid;
    }

    /**Переопределяем вывод - как у наследника*/
    @Override
    public String toString() {
        return super.toString();
    }
}
