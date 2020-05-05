package Minsk.Homeworks_4.Participants;

import Minsk.Homeworks_4.Generator.NumberGenerator;

public class Participant {

    private String playerName;
    private int[] numbersOnTheTicket;
    private boolean selected = false;
    private static final int countOfNumbers = 3;

    public void setPlayerName(int playerNumber) {
        this.playerName = "Игрок " + playerNumber;
    }

    public void setNumbersOnTheTicket() {
        this.numbersOnTheTicket = NumberGenerator.randomNumbersGenerator(countOfNumbers);
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
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
}
