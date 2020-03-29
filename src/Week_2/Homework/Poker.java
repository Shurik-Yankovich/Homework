package Week_2.Homework;

//3 - Покер - программа, которая имитирует раздачу карт для игры в покер.
// Пользователю предлагается ввести число n. Программа раздает карты на n игроков (по 5 карт каждому) из рассортированной колоды.
// Вывести карты всех игроков на экран.

import java.util.Random;
import java.util.Scanner;

public class Poker {

    private final static String[] cardFaceValue = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "В", "Д", "К", "Т"};
    private final static char[] cardSuit = {'♥', '♦', '♣', '♠'};
    private String[][] playingCard;
    private int player;

    public Poker() {
        Scanner scan = new Scanner(System.in);
        boolean choice = true;
        System.out.println("\nВведите количество игроков (не более 10):");
        do {
            player = scan.nextInt();
            if (player > 1 && player <= 10)
                choice = false;
            else
                System.out.println("Неверно введено количество игроков! Пожалуста введите снова:");
        } while (choice);
        playingCard = new String[player][5];
    }

    public void showCard() {
        for (int i = 0; i < player; i++) {
            System.out.print("Игрок " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                if (playingCard[i][j].length() == 3)
                    System.out.print(playingCard[i][j] + " ");
                else
                    System.out.print(" " + playingCard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void distributionOfCards() {
        Random random = new Random(System.currentTimeMillis());
        int value;
        int suit;
        boolean search;
        String card;
        for (int i = 0; i < player; i++) {
            for (int j = 0; j < 5; j++) {
                do {
                    value = random.nextInt(13);
                    suit = random.nextInt(4);
                    card = cardFaceValue[value] + cardSuit[suit];
                    search = searchCard(card, i, j);
                    if (!search)
                        playingCard[i][j] = card;
                } while (search);
            }
        }
    }

    private boolean searchCard(String whatSearch, int playerNumber, int cardNumber) {
            int card = 5;
            for (int i = 0; i <= playerNumber; i++) {
                if (i == playerNumber)
                    card = cardNumber;
                for (int j = 0; j < card; j++) {
                    if (playingCard[i][j].equals(whatSearch))
                        return true;
                }
            }
            return false;
    }

}
