package Minsk.Homeworks_4.Participants;

import Minsk.Homeworks_4.Generator.NumberGenerator;

public class Participant {

    private String playerName;
    private int[] numbersOnTheTicket;
    private boolean selected;
    private boolean winner;
    private static final int countOfNumbers = 3;

    public Participant(int playerNumber) {
        playerName = "Игрок " + playerNumber;
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

    public String getPlayerName() {
        return playerName;
    }

    public int[] getNumbersOnTheTicket() {
        return numbersOnTheTicket;
    }

    public boolean isSelected() {
        return selected;
    }

    public boolean isWinner() {
        return winner;
    }
}
