package introexceptionthrow.patient;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int year) {
        this.name = name;
        this.socialSecurityNumber = ssn;
        this.yearOfBirth = year;

        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("Hiányzik a név");
        }
        if (year < 1900) {
            throw new IllegalArgumentException("Érvénytelen születési év");
        }
        if (!(new SsnValidator().isValidSsn(ssn))) {
            throw new IllegalArgumentException("Érvénytelen TAJ szám");
        }
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        Patient patient;
        String format = "név: %s, TAJ: %s, szül.: %d%n";
        try {
            patient = new Patient("Gipsz Jakab", "123456789", 1980);
            System.out.printf(format, patient.getName(), patient.getSocialSecurityNumber(), patient.getYearOfBirth());
        } catch (IllegalArgumentException err) {
            System.out.println("1 " + err.getMessage());
        }

        try {
            patient = new Patient("Minta Áron", "123456788", 1970);
            System.out.printf(format, patient.getName(), patient.getSocialSecurityNumber(), patient.getYearOfBirth());
        } catch (IllegalArgumentException err) {
            System.out.println("2 " + err.getMessage());
        }

        try {
            patient = new Patient(null, "123456789", 80);
            System.out.printf(format, patient.getName(), patient.getSocialSecurityNumber(), patient.getYearOfBirth());
        } catch (IllegalArgumentException err) {
            System.out.println("3 " + err.getMessage());
        }

        try {
            patient = new Patient("Gipsz Jakab", "123456789", 80);
            System.out.printf(format, patient.getName(), patient.getSocialSecurityNumber(), patient.getYearOfBirth());
        } catch (IllegalArgumentException err) {
            System.out.println("4 " + err.getMessage());
        }
    }
}
