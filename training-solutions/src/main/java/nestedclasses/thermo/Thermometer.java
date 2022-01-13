package nestedclasses.thermo;

public class Thermometer {
    private String room;
    private int temperature;
    private ThermometerObserver observer;

    public Thermometer(String room, int temperature) {
        this.room = room;
        this.temperature = temperature;
    }

    public String getRoom() {
        return room;
    }

    public int getTemperature() {
        return temperature;
    }

    public ThermometerObserver getObserver() {
        return observer;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        onTemperatureChanged();
    }

    public void setThermometerObserver(ThermometerObserver observer) {
        this.observer = observer;
        onTemperatureChanged();
    }

    public void onTemperatureChanged() {
        if (observer != null) {
            observer.handleTemperatureChange(temperature, room);
        }
    }
}
