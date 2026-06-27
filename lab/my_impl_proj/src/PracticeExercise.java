
public class PracticeExercise {

    public static void main(String[] args) {

        SmartSpeaker newSmartSpeaker = new SmartSpeaker();
        System.out.println(newSmartSpeaker);

        newSmartSpeaker.connect();
        newSmartSpeaker.increaseVolume();
        newSmartSpeaker.turnOn();

    }

}
