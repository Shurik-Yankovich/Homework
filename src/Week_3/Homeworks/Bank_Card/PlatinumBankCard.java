package Week_3.Homeworks.Bank_Card;

public class PlatinumBankCard extends GoldBankCard {

    public PlatinumBankCard(int pinCod) {
        super(pinCod);
        limit = 10000;
        percentOnCredit = 13;
    }

    public boolean getCredit (double amountCredit) {
        addMoney(amountCredit);
        addCreditDebt(amountCredit * (100 + percentOnCredit) / 100);
        return true;
    }
}
