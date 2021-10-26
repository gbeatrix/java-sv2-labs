package composition.realestate;

public class Details {
    private String description;
    private Address address;
    private int squareMeter;
    private int areaOfSite;

    public Details(String description, Address address, int squareMeter, int areaOfSite) {
        this.description = description;
        this.address = address;
        this.squareMeter = squareMeter;
        this.areaOfSite = areaOfSite;
    }

    @Override
    public String toString() {
        return  " * cím: " + address + "\n" +
                " * lakás méret: " + squareMeter + " m2\n" +
                " * telek méret: " + areaOfSite + " m2\n" +
                " * leírás: " + description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(int squareMeter) {
        this.squareMeter = squareMeter;
    }

    public int getAreaOfSite() {
        return areaOfSite;
    }

    public void setAreaOfSite(int areaOfSite) {
        this.areaOfSite = areaOfSite;
    }
}
