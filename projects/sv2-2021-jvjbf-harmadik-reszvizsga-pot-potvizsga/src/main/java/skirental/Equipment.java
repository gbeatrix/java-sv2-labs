package skirental;

public class Equipment {
    private int sizeOfSkis;
    private int sizeOfBoot;

    public Equipment(int sizeOfSkis, int sizeOfBoot) {
        this.sizeOfSkis = sizeOfSkis;
        this.sizeOfBoot = sizeOfBoot;
    }

    public int getSizeOfSkis() {
        return sizeOfSkis;
    }

    public int getSizeOfBoot() {
        return sizeOfBoot;
    }
}
