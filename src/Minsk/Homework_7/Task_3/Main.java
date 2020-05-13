package Minsk.Homework_7.Task_3;

//Взять задание №4 (Лото) и заменить работу с массивами на работу с коллекциями:
//Наборы сгенерированных чисел должны храниться в листах;
//Также список всех сгенерированных игроков должен храниться в map и обращение к нему должно происходить по ключу (в качестве ключа можно использовать его порядковый номер);

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
    }
}
