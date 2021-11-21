package introexceptionthrow;

public class Validation {
    public void validateName(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("Hiányzik a név!");
        }
    }

    public void validateAge(String ageString) {
        if (ageString == null || ageString.length() == 0) {
            throw new IllegalArgumentException("Hiányzik a kor!");
        }
        int age;
        try {
            age = Integer.parseInt(ageString);
        } catch (NumberFormatException err) {
            throw new IllegalArgumentException("Nem számot adtál meg.");
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Érvénytelen koradat.");
        }
    }
}
