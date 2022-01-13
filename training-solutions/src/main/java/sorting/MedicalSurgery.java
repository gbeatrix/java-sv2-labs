package sorting;

import java.util.ArrayList;
import java.util.List;

public class MedicalSurgery {
    private List<Patient> patients;

    public MedicalSurgery(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Patient> getPatientsInTimeOrder(){
        List<Patient> ordered = new ArrayList<>(patients);
        ordered.sort(new PatientComparator());
        return ordered;
    }
}
