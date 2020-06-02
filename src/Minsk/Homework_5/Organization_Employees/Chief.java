package Minsk.Homework_5.Organization_Employees;

public class Chief extends Employee {

    public Chief() {
        super();
        System.out.println("class Chief");
    }

    @Override
    public void aboutMe() {
        System.out.println("Я начальник отдела. Слежу за работой всех сотрудников.");
    }
}
