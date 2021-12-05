package abstractclass.gamecharacter;

public class BattleField {
    private int round;

    public int getRound() {
        return round;
    }

    private boolean oneHit(Character attacker, Character defender) {
        if (attacker == null || defender == null) {
            return false;
        }
        if (attacker.isAlive() && defender.isAlive()) {
            attacker.primaryAttack(defender);
        }
        if (attacker.isAlive() && defender.isAlive()) {
            attacker.secondaryAttack(defender);
        }
        return (attacker.isAlive() && defender.isAlive());
    }

    public Character fight(Character one, Character other) {
        int i = 0;
        while (oneHit(one, other)) {
            Character temp = one;
            one = other;
            other = temp;
            round += ++i % 2;
        }
        return one;
    }
}
