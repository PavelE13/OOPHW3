package Controllers;

import StudentDomen.User;

/** Интерфейс - дженерик*/
public interface iUserController<T extends User> {
    /**Метод конструктор create
     * @param firstName
     * @param secondName
     * @param age
     */
    void create(String firstName, String secondName, int age);
}
