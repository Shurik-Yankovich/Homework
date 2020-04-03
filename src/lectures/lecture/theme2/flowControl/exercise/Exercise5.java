package lecture.theme2.flowControl.exercise;

/*
Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на экран.
Использовать оператор switch.
*/

public class Exercise5 {

    public static void main(String[] args) {
        int month = 3;
        System.out.println(whatSeason(month));
    }

    public static String whatSeason (int month) {
        String season;
        switch (month) {
            case 1:
            case 2:
            case 12: {
                season = "Зима";
                break;
            }
            case 3:
            case 4:
            case 5: {
                season = "Весна";
                break;
            }
            case 6:
            case 7:
            case 8: {
                season = "Лето";
                break;
            }
            case 9:
            case 10:
            case 11: {
                season = "Осень";
                break;
            }
            default:
                season ="Введен неправильный месяц!";
        }
        return season;
    }

}
