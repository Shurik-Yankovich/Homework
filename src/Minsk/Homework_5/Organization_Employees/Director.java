package Minsk.Homework_5.Organization_Employees;

public class Director extends Chief {

    public Director() {
        super();
        System.out.println("class Director");
    }

    @Override
    public void aboutMe() {
        System.out.println("Я дирректор всей фирмы!");
    }
}
