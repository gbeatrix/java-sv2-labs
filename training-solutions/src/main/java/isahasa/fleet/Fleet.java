package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Ship> ships = new ArrayList<>();
    private int waitingPeople;
    private int waitingCargo;

    public void addShip(Ship newShip) {
        ships.add(newShip);
    }

    public void loadShip(int passengers, int cargoWeight) {
        passengers += waitingPeople;
        cargoWeight += waitingCargo;
        for (int i = 0; (passengers > 0 || cargoWeight > 0) && i < ships.size(); i++) {
            if (ships.get(i) instanceof CanCarryPassengers) {
                CanCarryPassengers ship = (CanCarryPassengers) ships.get(i);
                passengers = ship.loadPassenger(passengers);
            }
            if (ships.get(i) instanceof CanCarryGoods) {
                CanCarryGoods ship = (CanCarryGoods) ships.get(i);
                cargoWeight = ship.loadCargo(cargoWeight);
            }
        }
        waitingPeople = passengers;
        waitingCargo = cargoWeight;
    }

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
