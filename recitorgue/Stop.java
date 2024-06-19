public class Stop {
    private String name;
    private Rank[] ranks;

    public Stop(String name, Rank[] ranks) {
        this.name = name;
        this.ranks = ranks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rank[] getRanks() {
        return ranks;
    }

    public void setRanks(Rank[] ranks) {
        this.ranks = ranks;
    }

    // Method to activate the stop
    public void activate() {
        System.out.println("Stop " + name + " activated.");
        for (Rank rank : ranks) {
            // Logic to activate each rank
            System.out.println("Rank with pitch " + rank.getPitch() + " activated.");
        }
    }
}
