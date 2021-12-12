package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers {
    private int passengers;
    private final int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassenger(int passengers) {
        int diff = Math.min(maxPassengers - this.passengers, passengers);
        this.passengers += diff;
        return passengers - diff;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}
