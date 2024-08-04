import java.util.List;

public class TeamDTO {
    private String name;
    private String division;
    private List<PlayerDTO> players;

    // Constructor
    public TeamDTO(String name, String division, List<PlayerDTO> players) {
        this.name = name;
        this.division = division;
        this.players = players;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public List<PlayerDTO> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerDTO> players) {
        this.players = players;
    }
}



