package Minsk.Homework_7.Task_3.Participant;

import Minsk.Homework_7.Task_3.Generator.NumberGenerator;

import java.util.List;

public class Participant {

    private List<Integer> numbersOnTheTicket;
    private boolean selected;
    private boolean winner;

    public Participant() {
        selected = false;
        winner = false;
    }

    public void setNumbersOnTheTicket(List<Integer> numbersOnTheTicket) {
        this.numbersOnTheTicket = numbersOnTheTicket;
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
