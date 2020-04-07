package Week_3.Homeworks.Bank_Card;

import java.math.BigDecimal;

public class GoldBankCard extends BankCard {

    protected double percentOnCredit;
    private double creditDebt;

    public GoldBankCard(int pinCod) {
        super(pinCod);
        limit = 5000;
        creditDebt = 0;
        percentOnCredit = 20.5;
    }

    private void setCreditDebt(double creditDebt) {
        this.creditDebt = creditDebt;
    }

    public void addCreditDebt (double debt) {
        creditDebt += debt;
    }

    public double getCreditDebt() {
        return creditDebt;
    }

    public boolean getCredit (double amountCredit) {
        boolean result;
        final double threshold = 0.0001;
        if (Math.abs(creditDebt) > threshold && !repaymentCredit()){
            result = false;
        } else {
            addMoney(amountCredit);
            addCreditDebt(amountCredit * (100 + percentOnCredit) / 100);
            result = true;
        }
        return result;
    }

    public boolean repaymentCredit () {
        boolean result;
        if (creditDebt < getMoney()) {
            addMoney(-creditDebt);
            setCreditDebt(0);
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public void balance() {
        super.balance();
        System.out.println("Задолженность по кредиту: " + getCreditDebt());
    }
}
