package Minsk.Homework_4;

import java.util.Scanner;

public class Main {

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
        scanner.close();
    }
}
