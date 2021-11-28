package defaultconstructor.chess;

import java.util.Arrays;
import java.util.List;

public class ChessTournament {
    private List<Team> teams;

    public ChessTournament() {
        teams = Arrays.asList(new Team(), new Team(), new Team());
    }

    public void addPlayersToTeams(List<Player> playersRegistrated) {
        for (int i = 0; i < 6 && i < playersRegistrated.size(); i++) {
            if (i % 2 == 0) {
                teams.get(i / 2).setPlayerOne(playersRegistrated.get(i));
            } else {
                teams.get(i / 2).setPlayerTwo(playersRegistrated.get(i));
            }
        }
    }

    public List<Team> getTeams() {
        return List.copyOf(teams);
    }
}
