package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {
    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return List.copyOf(vaccinationList);
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        List<Person> pregnants = new ArrayList<>();
        List<Person> seniors = new ArrayList<>();
        List<Person> others = new ArrayList<>();
        for (Person p : registrated) {
            if (p.getPregnant() == Pregnancy.YES) {
                pregnants.add(p);
            } else if (p.getAge() > 65) {
                seniors.add(p);
            } else {
                others.add(p);
            }
        }
        vaccinationList.clear();
        vaccinationList.addAll(pregnants);
        vaccinationList.addAll(seniors);
        vaccinationList.addAll(others);
    }
}
