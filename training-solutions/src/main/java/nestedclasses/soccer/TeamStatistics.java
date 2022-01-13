package nestedclasses.soccer;

import java.util.Objects;

public class TeamStatistics {
    private String teamName;
    private Inner data = new Inner();

    private static class Inner {
        private int played; // = won + tied + lost
        private int won;
        private int tied;
        private int lost;
        private int goalsFor;
        private int goalsAgainst;
        private int points; // = won*3 + tied*1 + lost*0
    }

    public TeamStatistics(String teamName) {
        this.teamName = teamName;
    }

    public void played(int plusGoalsFor, int plusGoalsAgainst) {
        data.goalsAgainst += plusGoalsAgainst;
        data.goalsFor += plusGoalsFor;
        data.played++;
        if (plusGoalsFor > plusGoalsAgainst) {
            data.won++;
            data.points += 3;
        } else if (plusGoalsFor < plusGoalsAgainst) {
            data.lost++;
        } else {
            data.tied++;
            data.points += 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamStatistics that = (TeamStatistics) o;
        return Objects.equals(teamName, that.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName);
    }

    public int getPlayed() {
        return data.played;
    }

    public int getWon() {
        return data.won;
    }

    public int getLost() {
        return data.lost;
    }

    public int getTied() {
        return data.tied;
    }

    public int getGoalsfor() {
        return data.goalsFor;
    }

    public int getGoalsAgainst() {
        return data.goalsAgainst;
    }

    public int getPoints() {
        return data.points;
    }
}
