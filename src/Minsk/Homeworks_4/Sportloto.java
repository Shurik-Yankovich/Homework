package Minsk.Homeworks_4;

import Minsk.Homeworks_4.Generator.NumberGenerator;
import Minsk.Homeworks_4.Participants.Participant;
import Minsk.Homeworks_4.Participants.ParticipantFactory;

public class Sportloto {

    private static final int countOfNumbers = 6;
    private int[] winningCombination;
    private Participant[] participants;

    public void setWinningCombination() {
        winningCombination = NumberGenerator.randomNumbersGenerator(countOfNumbers);
        System.out.print("Выигрышная комбинация: ");
        printNumbers(winningCombination);
    }

    public void setParticipants(int countParticipants) {
        participants = ParticipantFactory.generatorParticipants(countParticipants);
    }

    public int[] getWinningCombination() {
        return winningCombination;
    }
    public void choiceOfParticipant (int number) {
        participants[number - 1].setSelected(true);
    }

    public void printParticipants() {
        for (Participant participant : participants) {
            System.out.print(participant.getPlayerName() + " - Числа: ");
            printNumbers(participant.getNumbersOnTheTicket());
        }
    }

    public void printNumbers(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println(numbers[numbers.length - 1] + "]");
    }

    public void playGame() {
        for (Participant participant : participants) {
//            if (arrayInWinningCombination(participant.getNumbersOnTheTicket()))
//                participant.setWinner(true);
//            else
//                participant.setWinner(false);
            participant.setWinner(arrayInWinningCombination(participant.getNumbersOnTheTicket()));
        }
    }

    private boolean arrayInWinningCombination(int[] array) {
        int result = 0;
        for (int arrayNumber : array) {
            for (int number : winningCombination) {
                if (arrayNumber == number) {
                    result ++;
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
        for (Participant participant : participants) {
            if (participant.isWinner()) {
                System.out.println(participant.getPlayerName());
                if (participant.isSelected())
                    winner = true;
                result++;
            }
        }

        if (result == 0)
            System.out.println("Никто не победил!");

        if (winner)
            System.out.println("Вы выиграли!");
        else
            System.out.println("Вы проиграли!");
    }

}
