package Minsk.Homework_7.Task_3.Participant;

import Minsk.Homework_7.Task_3.Generator.NumberGenerator;

import java.util.List;

public class Participant {

    private List<Integer> numbersOnTheTicket;
    private boolean selected;
    private boolean winner;
    private static final int countOfNumbers = 3;

    public Participant() {
        selected = false;
        winner = false;
    }

    public void setNumbersOnTheTicket() {
        this.numbersOnTheTicket = NumberGenerator.randomNumbersGenerator(countOfNumbers);
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public List<Integer> getNumbersOnTheTicket() {
        return numbersOnTheTicket;
    }

    public boolean isSelected() {
        return selected;
    }

    public boolean isWinner() {
        return winner;
    }
}
