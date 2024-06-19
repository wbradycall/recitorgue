public class Rank {
    private int pitch;
    private int numberOfPipes;

    public Rank(int pitch, int numberOfPipes) {
        this.pitch = pitch;
        this.numberOfPipes = numberOfPipes;
    }

    public int getPitch() {
        return pitch;
    }

    public void setPitch(int pitch) {
        this.pitch = pitch;
    }

    public int getNumberOfPipes() {
        return numberOfPipes;
    }

    public void setNumberOfPipes(int numberOfPipes) {
        this.numberOfPipes = numberOfPipes;
    }

    public int sampleMethod(int y) {
        return pitch + y;
    }
}
