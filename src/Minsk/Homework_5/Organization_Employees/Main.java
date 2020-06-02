package Minsk.Homework_5.Organization_Employees;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[6];
        employees[0] = new Employee();
        employees[1] = new Programmer();
        employees[2] = new TeamLeader();
        employees[3] = new Chief();
        employees[4] = new Accountant();
        employees[5] = new Director();

        for (Employee employee : employees) {
            employee.aboutMe();
        }
    }
}
