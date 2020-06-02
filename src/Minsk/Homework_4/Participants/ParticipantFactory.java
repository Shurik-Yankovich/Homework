package Minsk.Homework_4.Participants;

public class ParticipantFactory {

    public static Participant[] generatorParticipants(int countParticipants) {
        Participant[] participants = new Participant[countParticipants];
        for (int i = 0; i < countParticipants; i++) {
            participants[i] = new Participant(i + 1);
            participants[i].setNumbersOnTheTicket();
        }
        return participants;
    }
}
