package streams;

import java.util.List;

public class Apartment {
    private String location;
    private int size;
    private BathRoomType bathRoomType;
    private List<String> extras;

    public Apartment(String location, int size, BathRoomType bathRoomType, List<String> extras) {
        this.location = location;
        this.size = size;
        this.bathRoomType = bathRoomType;
        this.extras = extras;
    }

    public List<String> getExtras() {
        return extras;
    }

    public BathRoomType getBathRoomType() {
        return bathRoomType;
    }

    public int getSize() {
        return size;
    }

    public String getLocation() {
        return location;
    }
}
