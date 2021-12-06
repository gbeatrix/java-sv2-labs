package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {
    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return List.copyOf(vaccinationList);
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        List<Person> juniors = new ArrayList<>();
        List<Person> seniors = new ArrayList<>();
        for (Person p : registrated) {
            if (p.getPregnant() == Pregnancy.NO && p.getChronic() == ChronicDisease.NO) {
                if (p.getAge() > 65) {
                    seniors.add(p);
                } else {
                    juniors.add(p);
                }
            }
            vaccinationList.clear();
            vaccinationList.addAll(juniors);
            vaccinationList.addAll(seniors);
        }
    }
}
