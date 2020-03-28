package Week_2.Homework;

//Таблица умножения - выводит таблицу умножения от 1 до 9

public class MultiplicationTable {
    public static void multiplicationFromOneToNine() {
        int result;
        tableHeader();
        for (int i = 1; i <= 9; i ++) {
            System.out.print(i + "| ");
            for (int j = 1; j <= 9; j++) {
                result = i*j;
                if (result > 9)
                    System.out.print(result + " ");
                else
                    System.out.print(" " + result + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void tableHeader() {
        System.out.print(" |  ");
        for (int i = 1; i <= 9; i++)
            System.out.print(i + "  ");
        System.out.println("\n ----------------------------");
    }

}
