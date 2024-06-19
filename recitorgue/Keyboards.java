public class Keyboards {
    private String name;
    private int numberOfKeys;
    private String actionType;
    private String keyboardType;

    public Keyboards(String name, int numberOfKeys, String actionType, String keyboardType) {
        this.name = name;
        this.numberOfKeys = numberOfKeys;
        this.actionType = actionType;
        this.keyboardType = keyboardType;
    }

    // Getters and setters for the properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(String keyboardType) {
        this.keyboardType = keyboardType;
    }

    // Additional methods specific to keyboards can be added here
}
