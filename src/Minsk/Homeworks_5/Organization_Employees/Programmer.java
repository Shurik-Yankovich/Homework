package Minsk.Homeworks_5.Organization_Employees;

public class Programmer extends Employee {

    public Programmer() {
        super();
        System.out.println("class Programmer");
    }

    @Override
    public void aboutMe() {
        System.out.println("Я программист!");
    }
}
