package methodparam.marriage;

import java.util.ArrayList;
import java.util.List;

public class Man {
    private String name;
    private List<RegisterDate> registerDates = new ArrayList<>();

    public Man(String name) {
        if(name == null || !name.trim().contains(" ")){
            throw new IllegalArgumentException("Name is invalid.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RegisterDate> getRegisterDates() {
        return List.copyOf(registerDates);
    }

    public void addRegisterDate(RegisterDate registerDate){
        registerDates.add(registerDate);
    }
}
