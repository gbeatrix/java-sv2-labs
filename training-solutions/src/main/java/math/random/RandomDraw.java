package math.random;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> players = Arrays.asList("András", "Béla", "Csaba", "Dénes", "Erik", "Ferenc", "Hugó", "István", "József", "Károly");
        Random random = new Random();
        int first  = 1 + random.nextInt(5);
        int second = 6 + random.nextInt(5);
        System.out.println(players.get(first));
        System.out.println(players.get(second%10));
    }
}
