package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {
    public Trainer getTrainerWithMaxAge(List<Trainer> trainers) {
        if (trainers == null || trainers.isEmpty()) {
            return null;
        } else {
            int index = 0;
            for (int i = 1; i < trainers.size(); i++) {
                if (trainers.get(i).getAge() > trainers.get(index).getAge()) {
                    index = i;
                }
            }
            return trainers.get(index);
        }
    }
}
