package algorithmsmax;

public class Plane {
    public int getLongestOcean(String map) {
        int currentLength = 0;
        int maxLength = 0;
        for (int i = 0; i < map.length(); i++) {
            if (map.charAt(i) == '1' && i > 0 && map.charAt(i - 1) == '0') {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 0;
            }
            if (map.charAt(i) == '0') {
                currentLength++;
            }
        }
        return maxLength;
    }

    public int getLongestOceanAlt(String map) {
        String[] oceans = map.split("1+");
        int maxLength = 0;
        for (String ocean : oceans) {
            if (ocean.length() > maxLength) {
                maxLength = ocean.length();
            }
        }
        return maxLength;
    }
}
