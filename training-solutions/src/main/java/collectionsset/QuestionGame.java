package collectionsset;

import java.util.*;

public class QuestionGame {
    private List<RightAnswer> rightAnswers;

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public Set<String> drawWinners() {
        Set<String> winners = new HashSet<>();
        Random random = new Random();
        while (winners.size() < 5) {
            if (rightAnswers.isEmpty()) {
                throw new IllegalArgumentException("Not enough right answers!");
            }
            int winner = random.nextInt(rightAnswers.size());
            winners.add(rightAnswers.remove(winner).getName());
        }
        return winners;
    }
}
