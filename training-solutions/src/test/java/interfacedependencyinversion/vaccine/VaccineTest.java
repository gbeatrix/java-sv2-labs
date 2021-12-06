package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VaccineTest {
    List<Person> registrated = new ArrayList<>();
    Vaccine vaccine;

    @BeforeEach
    void init() {
        registrated.add(new Person("Gipsz Jakab", 72, ChronicDisease.YES, Pregnancy.NO));
        registrated.add(new Person("Major Anna", 27, ChronicDisease.NO, Pregnancy.YES));
        registrated.add(new Person("Remek Elek", 68, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Vak Cinna", 32, ChronicDisease.YES, Pregnancy.YES));
        registrated.add(new Person("Minta Áron", 58, ChronicDisease.YES, Pregnancy.NO));
        registrated.add(new Person("Szikla Szilárd", 45, ChronicDisease.NO, Pregnancy.NO));
    }

    @Test
    void testFirstVaccine() {
        vaccine = new FirstVaccine();
        assertTrue(vaccine.getVaccinationList().isEmpty());
        vaccine.generateVaccinationList(registrated);
        assertEquals(6, vaccine.getVaccinationList().size());
        assertEquals(27, vaccine.getVaccinationList().get(0).getAge());
        assertEquals(32, vaccine.getVaccinationList().get(1).getAge());
        assertEquals(72, vaccine.getVaccinationList().get(2).getAge());
        assertEquals(68, vaccine.getVaccinationList().get(3).getAge());
        assertEquals(58, vaccine.getVaccinationList().get(4).getAge());
        assertEquals(45, vaccine.getVaccinationList().get(5).getAge());
    }

    @Test
    void testSecondVaccine() {
        vaccine = new SecondVaccine();
        assertTrue(vaccine.getVaccinationList().isEmpty());
        vaccine.generateVaccinationList(registrated);
        assertEquals(2, vaccine.getVaccinationList().size());
        assertEquals(45, vaccine.getVaccinationList().get(0).getAge());
        assertEquals(68, vaccine.getVaccinationList().get(1).getAge());
    }
}
