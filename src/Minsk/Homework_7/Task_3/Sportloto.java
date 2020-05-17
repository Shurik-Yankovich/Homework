package Minsk.Homework_7.Task_3;

import Minsk.Homework_7.Task_3.Generator.NumberGenerator;
import Minsk.Homework_7.Task_3.Participant.Participant;
import Minsk.Homework_7.Task_3.Participant.ParticipantFactory;

import java.util.List;
import java.util.Map;

public class Sportloto {

    private static final int COUNT_OF_NUMBERS = 6;
    private static final String PLAYER_NAME = "Игрок %d";

    private List<Integer> winningCombination;
    private Map<Integer, Participant> participants;



    public void setWinningCombination() {
        winningCombination = NumberGenerator.randomNumbersGenerator(COUNT_OF_NUMBERS);
        System.out.println("Выигрышная комбинация: " + winningCombination);
    }

    public void setParticipants(int countParticipants) {
        participants = ParticipantFactory.generatorParticipants(countParticipants);
    }

    public void choiceOfParticipant(int number) throws NullPointerException {
        participants.get(number).setSelected(true);
    }

    public void printParticipants() {
        for (int i = 1; i <= participants.size(); i++) {
            System.out.println(String.format(PLAYER_NAME, i) + " - Числа: " + participants.get(i).getNumbersOnTheTicket());
        }
    }

    public void playGame() {
        for (int i = 1; i <= participants.size(); i++) {
            participants.get(i).setWinner(arrayInWinningCombination(participants.get(i).getNumbersOnTheTicket()));
        }
    }

    private boolean arrayInWinningCombination(List<Integer> array) {
        int result = 0;
        for (int arrayNumber : array) {
            for (int number : winningCombination) {
                if (arrayNumber == number) {
                    result++;
                    break;
                }
            }
        }
        return result == 3;
    }

    public void isWinners() {
        boolean winner = false;
        int result = 0;

        System.out.println("Победили следущие участники:");
        for (int i = 1; i <= participants.size(); i++) {
            if (participants.get(i).isWinner()) {
                System.out.println(String.format(PLAYER_NAME, i));
                if (participants.get(i).isSelected()) {
                    winner = true;
                }
                result++;
            }
        }

        if (result == 0) {
            System.out.println("Никто не победил!");
        }

        if (winner) {
            System.out.println("Вы выиграли!");
        } else {
            System.out.println("Вы проиграли!");
        }
    }

}
