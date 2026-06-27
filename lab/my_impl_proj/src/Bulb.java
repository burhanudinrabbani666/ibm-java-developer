/**
 * Switchable
interface Switchable {
    void turnOn();
    
    void turnOff();
    
}
*/

/**
 * Adjustable
 */
interface Adjustable {
    void increase();

    void decrease();

}

/**
 * Connectable
 * interface Connectable {
 * void Connect();
 * 
 * void Disconnect();
 * }
 */

public class Bulb implements Switchable, Adjustable, Connectable {

    private Boolean isOn = false;
    private Integer brightness = 50;
    private Boolean isConnected = false;

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("Smartbulb is ON");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("Smartbulb is OFF");
    }

    @Override
    public void connect() {
        this.isConnected = true;
        System.out.println("Smartbulb is connected to network");
    }

    @Override
    public void disconnect() {
        this.isConnected = false;
        System.out.println("Smartbulb is disconnected to network");
    }

    @Override
    public void increase() {
        if (this.brightness <= 100) {
            this.brightness += 10;
            System.out.println("Brightness increased to " + brightness + "%.");
        } else {
            System.out.println("Brightness is already at maximum.");
        }
    }

    @Override
    public void decrease() {
        if (this.brightness >= 10) {
            this.brightness -= 10;
            System.out.println("Brightness decrease to " + brightness + "%.");
        } else {
            System.out.println("Brightness is already at minimum.");
        }
    }
}
