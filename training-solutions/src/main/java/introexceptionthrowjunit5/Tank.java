package introexceptionthrowjunit5;

public class Tank {
    private int angle;

    public int getAngle() {
        return angle;
    }

    public void modifyAngle(int angleNumber) {
        angle = (angle + (angleNumber % 360) + 540) % 360 - 180;
        if (Math.abs(angle) > 80) {
            throw new IllegalArgumentException("Nem tudom elforgatni a tank csövét.");
        }
    }
}
