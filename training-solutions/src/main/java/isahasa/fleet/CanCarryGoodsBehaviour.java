package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods {
    private int cargoWeight;
    private final int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        this.cargoWeight += cargoWeight;
        if (this.cargoWeight > maxCargoWeight) {
            int result = this.cargoWeight - maxCargoWeight;
            this.cargoWeight = maxCargoWeight;
            return result;
        } else {
            return 0;
        }
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }
}
