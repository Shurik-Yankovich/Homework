package Minsk.Homework_6.Task_1.Menu;

import Minsk.Homework_6.Task_1.Menu.Item.MainMenuActions;
import Minsk.Homework_6.Task_1.Menu.Item.MenuItem;
import Minsk.Homework_6.Task_1.Menu.Item.SecondMenuActions;
import Minsk.Homework_6.Task_1.Sort.BubbleSort;
import Minsk.Homework_6.Task_1.Sort.SelectionSort;
import Minsk.Homework_6.Task_1.Sort.ShellSort;
import Minsk.Homework_6.Task_1.Sort.Sortable;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Menu {

//    private static final String MAIN_MENU_TEXT = "Выберите вид сортировки:\n1 – Сортировка пузырьком\n2 - Сортировка методом выбора\n3 – Сортировка методом Шелла\n0 – Выход";
//    private static final String SECOND_MENU_TEXT = "Выберите тип сортировки:\n1 - по возрастанию\n2 - по убыванию";
//    private static final int BUBBLE_SORT = 1;
//    private static final int SELECTION_SORT = 2;
//    private static final int SHELL_SORT = 3;
//    private static final int EXIT = 4;

    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int[] array;
        Sortable sortable;
        String arrayBeforeSorting;

        System.out.println("Введите массив чисел");
        array = setArray();
        arrayBeforeSorting = arrayToString(array);
        sortable = mainMenuAction();
        secondMenuAction(sortable, array);
        printSort(arrayBeforeSorting, arrayToString(array));

    }

    private int[] setArray() {
        int[] array;
        System.out.println("Введите кол-во элемнтов массива:");
        array = new int[readIntFromConsole()];
        fillingTheArray(array);
        return array;
    }

    private void fillingTheArray(int[] array) {
        int choiceInput;
        do {
            System.out.println("Выберите как заполнить массив:\n1 - В ручную\n2 - Случайными числами от 0 до 100");
            choiceInput = readIntFromConsole();
            switch (choiceInput) {
                case 1:
                    manuallyFillingTheArray(array);
                    break;
                case 2:
                    fillingTheArrayWithRandomNumbers(array);
                    break;
                default:
                    System.out.println("Неверно выбран пункт меню!");
            }
        } while (choiceInput != 1 && choiceInput != 2);
    }

    private void manuallyFillingTheArray(int[] array) {
        System.out.println(String.format("Введите %d чисел:", array.length));
        for (int i = 0; i < array.length; i++) {
            array[i] = readIntFromConsole();
        }
    }

    private void fillingTheArrayWithRandomNumbers(int[] array) {
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    private Sortable mainMenuAction() {
        switch (mainMenu()) {
            case BUBBLE_SORT:
                return new BubbleSort();
            case SELECTION_SORT:
                return new SelectionSort();
            case SHELL_SORT:
                return new ShellSort();
            case EXIT:
                System.exit(0);
        }
        return null;
    }

    private MainMenuActions mainMenu() {
        int choiceMainMenuAction;
        do {
            System.out.println("Выберите вид сортировки:");
            printMenu(menuFactory.getMainMenu(MainMenuActions.values()));
            choiceMainMenuAction = readIntFromConsole() - 1;
        } while (choiceMainMenuAction < 0 || choiceMainMenuAction >= SecondMenuActions.values().length);

        return MainMenuActions.values()[choiceMainMenuAction];
    }

    private void secondMenuAction(Sortable sortable, int[] array) {
        switch (secondMenu()) {
            case SORT_ASCENDING:
                sortable.sortAscending(array);
                break;
            case SORT_DESCENDING:
                sortable.sortDescending(array);
                break;
        }
    }

    private SecondMenuActions secondMenu() {
        int choiceSecondMenuAction;

        do {
            System.out.println("Выберите тип сортировки:");
            printMenu(menuFactory.getSecondMenu(SecondMenuActions.values()));
            choiceSecondMenuAction = readIntFromConsole() - 1;
        } while (choiceSecondMenuAction < 0 || choiceSecondMenuAction >= SecondMenuActions.values().length);

        return SecondMenuActions.values()[choiceSecondMenuAction];
    }

    private void printMenu(List<MenuItem> menuItemList) {
        for (MenuItem menuItem : menuItemList) {
            System.out.println(menuItem);
        }
    }

    private int readIntFromConsole() {
        return scanner.nextInt();
    }

    private void printSort(String arrayBeforeSorting, String arrayAfterSorting) {
        System.out.println("Массив до сортировки:    " + arrayBeforeSorting);
        System.out.println("Массив после сортировки: " + arrayAfterSorting);
    }

    private String arrayToString(int[] array) {
        if (array != null) {
            String text = "[";
            for (int i = 0; i < array.length - 1; i++) {
                text += array[i] + ", ";
            }
            text += array[array.length - 1] + "]";
            return text;
        }
        return "Массив пуст";
    }
}
