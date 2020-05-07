package Minsk.Homeworks_5.Organization_Employees;

public class Accountant extends Employee {

    public Accountant() {
        super();
        System.out.println("class Accountant");
    }

    @Override
    public void aboutMe() {
        System.out.println("Я бухгалтер.");
    }
}
