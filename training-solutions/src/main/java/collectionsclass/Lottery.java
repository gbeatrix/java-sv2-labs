package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {
    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        return selectWinningNumbers(lotteryType, ballCount, new Random());
    }

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount, Random random) {
        if (lotteryType >= ballCount) {
            throw new IllegalArgumentException("There must be more balls than the winning numbers!");
        }
        List<Integer> balls = new ArrayList<>(ballCount);
        for (int i = 1; i <= ballCount; i++) {
            balls.add(i);
        }
        Collections.shuffle(balls, random);
        List<Integer> result = balls.subList(0, lotteryType);
        Collections.sort(result);
        return result;
    }
}
