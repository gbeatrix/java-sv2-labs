package stringseparate;

public class IceCream {
    public static void main(String[] args) {
        String[] icecream = { "csoki", "vanília", "eper", "citrom", "puncs"};
        String campaign = "Gyerekeknek féláron!";

        StringBuilder sb = new StringBuilder("Ma kapható: ");
        for (int i = 0; i < icecream.length; i++) {
            sb.append(icecream[i]);
            sb.append((i==icecream.length-1)?". ":", ");
        }

        sb.append(campaign);

        System.out.println(sb);
    }
}
