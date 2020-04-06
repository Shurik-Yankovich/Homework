package Week_3.Homeworks;

import java.util.Scanner;

public class WorkWithATM {

    public static void main(String[] args) {
        ATM atm = new ATM(10,10,10);
        int choice;
        do {
            choice = menu();
            switch (choice) {
                case 1:
                    atm.replenishmentATM();
                    break;
                case 2:
                    System.out.println("Введите снимаемую сумму:");
                    Scanner scanner = new Scanner(System.in);
                    if (!atm.withdrawMoney(scanner.nextInt()))
                        System.out.println("Данную сумму не возможно снять!");
                    break;
                case 3:
                    atm.printOfRemainingBills();
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
        System.out.println("1 - Пополнить банкомат купюрами.");
        System.out.println("2 - Снять деньги.");
        System.out.println("3 - Посмотреть сколько купюр осталось в банкомате.");
        System.out.println("4 - Выход.");
        return scanner.nextInt();
    }
}
