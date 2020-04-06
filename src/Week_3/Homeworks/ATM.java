package Week_3.Homeworks;

//Задача 1
//Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в банкомате должен задаваться тремя свойствами:
// количеством купюр номиналом 20 50 100. Сделать методы для добавления денег в банкомат.
// Сделать функцию снимающую деньги. На вход передается сумма денег. На выход – булевское значение (операция удалась или нет).
// При снятии денег функция должна рапечатывать каким количеством купюр какого номинала выдается сумма.
// Создать конструктор с тремя параметрами – количеством купюр. Прочее – на ваше усмотрение.

import java.util.Scanner;

public class ATM {

    private int quantityBillTwenty;
    private int quantityBillFifty;
    private int quantityBillOneHundred;

    public ATM(int quantityBillTwenty, int quantityBillFifty, int quantityBillOneHundred) {
        this.quantityBillTwenty = quantityBillTwenty;
        this.quantityBillFifty = quantityBillFifty;
        this.quantityBillOneHundred = quantityBillOneHundred;
    }

    public ATM() {
    }

    public void replenishmentATM () {
        int countBillOneHundred;
        int countBillFifty;
        int countBillTwenty;
        System.out.println("Введите кол-во купюр на которое пополняется банкомат:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Купюры номиналом 100:");
        countBillOneHundred = scan.nextInt();
        System.out.println("Купюры номиналом 50:");
        countBillFifty = scan.nextInt();
        System.out.println("Купюры номиналом 20:");
        countBillTwenty = scan.nextInt();
        addMoney(countBillTwenty, countBillFifty, countBillOneHundred);
    }

    public void addMoney (int quantityBillTwenty, int quantityBillFifty, int quantityBillOneHundred) {
        addBillTwenty(quantityBillTwenty);
        addBillFifty(quantityBillFifty);
        addBillOneHundred(quantityBillOneHundred);
    }

    public void addMoney (int quantityBillTwenty, int quantityBillFifty) {
        addBillTwenty(quantityBillTwenty);
        addBillFifty(quantityBillFifty);
    }

    public void addBillTwenty (int quantityBillTwenty) {
        this.quantityBillTwenty += quantityBillTwenty;
    }

    public void addBillFifty (int quantityBillFifty) {
        this.quantityBillFifty += quantityBillFifty;
    }

    public void addBillOneHundred (int quantityBillOneHundred) {
        this.quantityBillOneHundred += quantityBillOneHundred;
    }

    public boolean withdrawMoney (int withdrawalAmount) {
        boolean result;
        int possibleAmount = withdrawalAmount;
        int countBillTwenty = 0;
        int countBillFifty = 0;
        int countBillOneHundred = 0;
        int sum = 100 * quantityBillOneHundred + 50 * quantityBillFifty + 20 * quantityBillTwenty;
        if (withdrawalAmount % 10 == 0 && sum >= withdrawalAmount && withdrawalAmount >= 20 && withdrawalAmount != 30) {
            countBillOneHundred = countBill(possibleAmount, 100);
            possibleAmount -= countBillOneHundred * 100;
            countBillFifty = countBill(possibleAmount, 50);
            possibleAmount -= countBillFifty * 50;
            if (possibleAmount % 20 != 0 ) {
                if (countBillFifty > 0) {
                    possibleAmount += 50;
                    countBillFifty--;
                } else if (countBillOneHundred > 0) {
                    possibleAmount += 100 - 50;
                    countBillOneHundred--;
                    countBillFifty++;
                }
            }
            countBillTwenty = countBill(possibleAmount, 20);
            possibleAmount -= countBillTwenty * 20;
            result = possibleAmount == 0;
        }
        else
            result = false;
        if (result)
            withdrawalResult(withdrawalAmount, countBillTwenty, countBillFifty, countBillOneHundred);
        return result;
    }

    private int countBill (int amount, int bill) {
        int count = amount / bill;
        int quantity = 0;
        switch (bill) {
            case 20:
                quantity = quantityBillTwenty;
                break;
            case 50:
                quantity = quantityBillFifty;
                break;
            case 100:
                quantity = quantityBillOneHundred;
                break;
        }
        if (count > quantity)
            count = quantity;
        return count;
    }

    private void withdrawalResult(int withdrawalAmount, int countBillTwenty, int countBillFifty, int countBillOneHundred) {
        System.out.println("Сумма " + withdrawalAmount + " будет выдана следующими купюрами:");
        if (countBillOneHundred > 0)
            System.out.println("Купюры номиналом 100 - " + countBillOneHundred + " штук");
        if (countBillFifty > 0)
            System.out.println("Купюры номиналом 50 - " + countBillFifty + " штук");
        if (countBillTwenty > 0)
            System.out.println("Купюры номиналом 20 - " + countBillTwenty + " штук");
        quantityBillOneHundred -= countBillOneHundred;
        quantityBillFifty -= countBillFifty;
        quantityBillTwenty -= countBillTwenty;
    }

    public void printOfRemainingBills() {
        System.out.println("В банкомате осталось:");
        System.out.println("Купюры номиналом 100 - " + quantityBillOneHundred + " штук");
        System.out.println("Купюры номиналом 50 - " + quantityBillFifty + " штук");
        System.out.println("Купюры номиналом 20 - " + quantityBillTwenty + " штук");
    }
}
