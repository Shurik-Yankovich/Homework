package Week_2.Homework;

//Создать консольную программу с пунктами меню, которые будут выводить решения задач:
//
//1 - Таблица умножения - выводит таблицу умножения от 1 до 9
//2 - Подсчет символов - пользователю предлагается ввести текст и символ для поиска.
// После этого на экран выводится количество символов в тексте
//3 - Покер - программа, которая имитирует раздачу карт для игры в покер.
// Пользователю предлагается ввести число n. Программа раздает карты на n игроков (по 5 карт каждому) из рассортированной колоды.
// Вывести карты всех игроков на экран.
//4 - Выход - программа завершается.
//При выполнении заданий используйте отдельный класс для каждого пункта меню.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        do {
            choice =  menu();
            switch (choice){
                case 1:
                    MultiplicationTable.multiplicationFromOneToNine();
                    break;
                case 2:
                    CharacterCount characterCount = new CharacterCount();
                    characterCount.symbolCount();
                    break;
                case 3:
                    Poker poker = new Poker();
                    poker.distributionOfCards();
                    poker.showCard();
                    break;
                case 4:
                    System.out.println("Спасибо что выбрали нашу программу!)");
                    break;
                default:
                    System.out.println("Выбран не верный пункт меню! Пожалуйста повторите ваш выбор.");
            }
        } while (choice != 4);

    }

    private static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите пункт меню:");
        System.out.println("1 - Таблица умножения.");
        System.out.println("2 - Подсчет символов.");
        System.out.println("3 - Покер.");
        System.out.println("4 - Выход.");
        return scanner.nextInt();
    }
}
