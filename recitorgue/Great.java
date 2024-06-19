public class Great extends Keyboards {
    private String pedalType;

    public Great(String name, int numberOfKeys, String actionType, String pedalType) {
        super(name, numberOfKeys, actionType, "Organ Great");
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
