public class PlayerDTO  {
    private String name;
    private int jerseyNumber;

    // Constructor
    public PlayerDTO(String name, int jerseyNumber) {

        this.name = name;
        this.jerseyNumber = jerseyNumber;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
}
