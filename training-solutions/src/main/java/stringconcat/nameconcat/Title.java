package stringconcat.nameconcat;

public enum Title {
    MR("Mr."),
    MRS("Mrs."),
    MS("Ms."),
    DR("Dr.");

    private String value;

    Title(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
