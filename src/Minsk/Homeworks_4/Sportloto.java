package Minsk.Homeworks_4;

import Minsk.Homeworks_4.Generator.NumberGenerator;
import Minsk.Homeworks_4.Participants.Participant;
import Minsk.Homeworks_4.Participants.ParticipantFactory;

import java.util.Scanner;

public class Sportloto {

    private int[] winningCombination;
    private Participant[] participants;
    private static final int countOfNumbers = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sportloto sportloto = new Sportloto();

        System.out.println("Введите количество участников:");
        sportloto.setParticipants(scanner.nextInt());

        sportloto.printParticipants();
        System.out.println("Выбирете участника из списка выше:");
        sportloto.choiceOfParticipant(scanner.nextInt());

        sportloto.setWinningCombination();
        sportloto.playGame();
        sportloto.isWinners();
    }

    public void setWinningCombination() {
        winningCombination = NumberGenerator.randomNumbersGenerator(countOfNumbers);
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
            if (abrakasyabra(participant.getNumbersOnTheTicket()))
                participant.setWinner(true);
            else
                participant.setWinner(false);
        }
    }

    private boolean abrakasyabra (int[] array) {
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

        System.out.println("Выйграли следущие участники:");
        for (Participant participant : participants) {
            if (participant.isWinner()) {
                System.out.println(participant.getPlayerName());
                if (participant.isSelected())
                    winner = true;
                result++;
            }
        }

        if (result == 0)
            System.out.println("Никто не выйграл!");

        if (winner)
            System.out.println("Вы выйграли!");
        else
            System.out.println("Вы проиграли!");
    }

}
