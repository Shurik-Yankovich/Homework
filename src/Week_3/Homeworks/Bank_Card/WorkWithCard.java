package Week_3.Homeworks.Bank_Card;

//Задача 2
//Создать иерархию классов, описывающих банковские карточки. Иерархия должна иметь хотя бы три уровня.

public class WorkWithCard {

    public static void main(String[] args) {
        BankCard bankCard = new BankCard(1234);
        GoldBankCard goldBankCard = new GoldBankCard(5678);
        PlatinumBankCard platinumBankCard = new PlatinumBankCard(1111);

        bankCard.addMoney(5000);
        goldBankCard.addMoney(5000);
        platinumBankCard.addMoney(5000);

        if (!bankCard.withdrawMoney(2000))
            System.out.println("Неудалось снять деньги");
        if (!goldBankCard.withdrawMoney(2000))
            System.out.println("Неудалось снять деньги");
        if (!platinumBankCard.withdrawMoney(2000))
            System.out.println("Неудалось снять деньги");

        if (!goldBankCard.getCredit(5000))
            System.out.println("Неудалось взять кредит");
        if (!platinumBankCard.getCredit(5000))
            System.out.println("Неудалось взять кредит");

        if (!goldBankCard.getCredit(10000))
            System.out.println("Неудалось взять кредит");
        if (!platinumBankCard.getCredit(10000))
            System.out.println("Неудалось взять кредит");

        if (!goldBankCard.getCredit(7000))
            System.out.println("Неудалось взять кредит");
        if (!platinumBankCard.getCredit(7000))
            System.out.println("Неудалось взять кредит");

        bankCard.balance();
        goldBankCard.balance();
        platinumBankCard.balance();

    }
}
