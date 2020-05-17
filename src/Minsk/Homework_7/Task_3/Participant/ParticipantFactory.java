package Minsk.Homework_7.Task_3.Participant;

import Minsk.Homework_7.Task_3.Generator.NumberGenerator;

import java.util.HashMap;
import java.util.Map;

public class ParticipantFactory {

    private static final int countOfNumbersOnTheTicket = 3;

    public static Map<Integer, Participant> generatorParticipants(int countParticipants) {
        Map<Integer, Participant> participants = new HashMap<>();
        for (int i = 1; i <= countParticipants; i++) {
            participants.put(i, new Participant());
            participants.get(i).setNumbersOnTheTicket(NumberGenerator.randomNumbersGenerator(countOfNumbersOnTheTicket));
        }
        return participants;
    }
}
