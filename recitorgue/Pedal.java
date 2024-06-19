public class Pedal extends Keyboards {
    private String pedalType;

    public Pedal(String name, int numberOfKeys, String actionType, String pedalType) {
        super(name, numberOfKeys, actionType, "Organ Pedal");
        this.pedalType = pedalType;
    }

    public String getPedalType() {
        return pedalType;
    }

    public void setPedalType(String pedalType) {
        this.pedalType = pedalType;
    }

    // Additional methods specific to pedals can be added here
}
