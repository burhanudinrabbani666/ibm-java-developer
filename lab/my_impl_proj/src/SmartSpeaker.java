/**
 * Switchable
 */
interface Switchable {
    void turnOn();

    void turnOff();

}

/**
 * Connectable
 */
interface Connectable {
    void connect();

    void disconnect();
}

interface Volume {
    void increaseVolume();

    void decreaseVolume();
}

public class SmartSpeaker implements Switchable, Connectable, Volume {

    private Boolean isOn;
    private Boolean isConnect;
    private Integer volume;

    public SmartSpeaker() {
        this.isOn = false;
        this.isConnect = false;
        this.volume = 50;
    }

    @Override
    public void increaseVolume() {
        if (this.volume <= 100) {
            this.volume += 10;
            System.out.println("volume: " + this.volume);
        } else {
            System.out.println("volume is maximum.");
        }
    }

    @Override
    public void decreaseVolume() {
        if (this.volume >= 100) {
            this.volume -= 10;
            System.out.println("volume: " + this.volume);
        } else {
            System.out.println("volume is minimum.");
        }
    }

    @Override
    public void connect() {
        this.isConnect = true;
        System.out.println("SmartSpeaker connected to network");

    }

    @Override
    public void disconnect() {
        this.isConnect = false;
        System.out.println("SmartSpeaker disconnected to network");
    }

    @Override
    public void turnOn() {
        this.isConnect = true;
        System.out.println("SmartSpeaker is active");
    }

    @Override
    public void turnOff() {
        this.isConnect = false;
        System.out.println("SmartSpeaker is not-active");
    }

}
