package nestedclasses.soccer;

import java.util.ArrayList;
import java.util.List;

public class Championship {
    private List<TeamStatistics> leagueTable = new ArrayList<>();

    public void addGame(GameResult result) {
        TeamStatistics home = getTeamStatistics(result.teamHome);
        TeamStatistics guest = getTeamStatistics(result.teamGuest);
        home.played(result.goalHome, result.goalGuest);
        guest.played(result.goalGuest, result.goalHome);
    }

    private TeamStatistics getTeamStatistics(String teamName) {
        TeamStatistics team = new TeamStatistics(teamName);
        int idx = leagueTable.indexOf(team);
        if (idx < 0) {
            leagueTable.add(team);
        }
        return idx < 0 ? team : leagueTable.get(idx);
    }

    public List<TeamStatistics> getLeagueTable() {
        return List.copyOf(leagueTable);
    }

    public static class GameResult {
        private String teamHome;
        private String teamGuest;
        private int goalHome;
        private int goalGuest;

        public GameResult(String teamHome, String teamGuest, int goalHome, int goalGuest) {
            this.teamHome = teamHome;
            this.teamGuest = teamGuest;
            this.goalHome = goalHome;
            this.goalGuest = goalGuest;
        }
    }
}
