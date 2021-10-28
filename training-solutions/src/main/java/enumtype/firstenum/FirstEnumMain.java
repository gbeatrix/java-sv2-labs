package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {
        System.out.println(Continent.AFRICA);
        System.out.println(Continent.AMERICA);
        System.out.println(Continent.ANTARTCTICA);
        System.out.println(Continent.ASIA);
        System.out.println(Continent.AUSTRALIA);
        System.out.println(Continent.EUROPE);
        System.out.println(Arrays.toString(Continent.values()));

        System.out.println(Ocean.valueOf("ATLANTIC"));
        System.out.println(Ocean.valueOf("PACIFIC"));
        System.out.println(Ocean.valueOf("INDIAN"));
        System.out.println(Ocean.valueOf("SOUTHERN"));
        System.out.println(Ocean.valueOf("ARCTIC"));

        System.out.println(Football.CENTRAL_DEFENDER.name());
        System.out.println(Football.GOALKEEPER.name());
        System.out.println(Football.LEFT_BACK_DEFENDER.name());
        System.out.println(Football.LEFT_WINGER.name());
        System.out.println(Football.MIDFIELDER.name());
        System.out.println(Football.RIGHT_BACK_DEFENDER.name());
        System.out.println(Football.RIGHT_WINGER.name());
        System.out.println(Football.STRIKER.name());
    }
}
