package Minsk.Homework_7.Task_3.Participant;

import java.util.HashMap;
import java.util.Map;

public class ParticipantFactory {

    public static Map<Integer, Participant> generatorParticipants(int countParticipants) {
        Map<Integer, Participant> participants = new HashMap<>();
        for (int i = 1; i <= countParticipants; i++) {
            participants.put(i, new Participant());
            participants.get(i).setNumbersOnTheTicket();
        }
        return participants;
    }
}
