package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {
    Map<VoteResult, Integer> getResult(Map<String, VoteResult> votes) {
        Map<VoteResult, Integer> result = new HashMap<>();
        for (VoteResult vote : VoteResult.values()){
            result.put(vote, 0);
        }
        for (VoteResult vote : votes.values()) {
            result.put(vote, result.get(vote) + 1);
        }
        return result;
    }
}
