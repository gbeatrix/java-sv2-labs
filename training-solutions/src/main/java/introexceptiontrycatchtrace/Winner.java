package introexceptiontrycatchtrace;

import java.util.Arrays;
import java.util.List;

public class Winner {
    private List<String> participants = Arrays.asList("Minta Áron", null, "Remek Elek", "Zsíros B. Ödön", "Major Anna", "Gipsz Jakab", "Szikla Szilárd");

    public String getWinner(){
        int k = (int)(participants.size()*Math.random());
        return participants.get(k).toUpperCase();
    }
}
