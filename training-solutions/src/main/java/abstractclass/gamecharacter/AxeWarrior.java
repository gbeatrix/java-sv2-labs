package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character {
    public AxeWarrior(Point position, Random random) {
        super(position, random);
    }

    private int getActualSecondaryDamage() {
        return getRandom().nextInt(1, getActualPrimaryDamage() * 2 + 1);
    }

    @Override
    public void secondaryAttack(Character enemy) {
        if (getPosition().distance(enemy.getPosition()) < 2) {
            hit(enemy, getActualSecondaryDamage());
        }
    }
}
