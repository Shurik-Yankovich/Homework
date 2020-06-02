package Minsk.Homework_5.Organization_Employees;

public class TeamLeader extends Programmer {

    public TeamLeader() {
        super();
        System.out.println("class TeamLeader");
    }

    @Override
    public void aboutMe() {
        System.out.println("Я лидер команды, отвечаю за работу всей нашей команды.");
    }
}
