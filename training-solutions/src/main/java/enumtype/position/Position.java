package enumtype.position;

public enum Position {
    BOSS(2_500_000, "cégautó"),
    HR(500_000, "kávé, telefon, laptop"),
    ACCOUNTANT(500_000, "kávé, laptop"),
    ADMINISTRATOR(500_000, "cégautó, üdülési utalvány"),
    EMPLOYEE(100_000, "étkezési utalvány, iskolakezdési támogatás");

    private int salary;
    private String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
