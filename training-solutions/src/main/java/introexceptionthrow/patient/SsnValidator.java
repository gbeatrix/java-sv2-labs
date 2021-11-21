package introexceptionthrow.patient;

public class SsnValidator {
    public boolean isValidSsn(String ssn) {
        if (ssn == null || ssn.length() != 9) {
            return false;
        }
        int sum = 0;
        int check;
        try {
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0) {
                    sum += 3 * Integer.parseInt(ssn.substring(i, i + 1));
                } else {
                    sum += 7 * Integer.parseInt(ssn.substring(i, i + 1));
                }
            }
            check = Integer.parseInt(ssn.substring(8));
        } catch (NumberFormatException err) {
            return false;
        }
        return sum % 10 == check;
    }
}
