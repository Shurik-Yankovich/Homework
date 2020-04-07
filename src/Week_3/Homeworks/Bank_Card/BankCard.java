package Week_3.Homeworks.Bank_Card;

public class BankCard {

    private int pinCod;
    private double money;
    protected double limit;

    public BankCard(int pinCod) {
        this.pinCod = pinCod;
        this.money = 0;
        this.limit = 1000;
    }

    public void setPinCod(int pinCod) {
        this.pinCod = pinCod;
    }

    public double getMoney() {
        return money;
    }

    public void addMoney (double money) {
        this.money += money;
    }

    public boolean withdrawMoney (double money) {
        boolean result;
        if (money > this.limit || money > getMoney()) {
            result = false;
        } else {
            addMoney(-money);
            result = true;
        }
        return result;
    }

    public void balance() {
        System.out.println("На вашем балансе осталось: " + getMoney());
    }

}
