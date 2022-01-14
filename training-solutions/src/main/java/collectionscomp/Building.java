package collectionscomp;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {
    private String address;
    private int area;
    private int levels;

    public Building(String address, int area, int levels) {
        this.address = address;
        this.area = area;
        this.levels = levels;
    }

    public String getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }

    public int getLevels() {
        return levels;
    }

    @Override
    public String toString() {
        return "" + levels;
    }

    @Override
    public int compareTo(Building o) {
        return Integer.compare(levels, o.levels);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return levels == building.levels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    public static void main(String[] args) {
        Set<Building> buildings = new TreeSet<>();
        buildings.add(new Building("Fő utca 1.", 120, 2));
        buildings.add(new Building("Petőfi S. út 8.", 150, 1));
        buildings.add(new Building("Bocskai tér 1.", 240, 8));
        buildings.add(new Building("Tél utca 21.", 200, 5));
        buildings.add(new Building("Tisza u. 4.", 80, 3));
        System.out.println(buildings);
    }
}
