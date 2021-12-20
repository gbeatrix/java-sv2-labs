package schoolrecords;

public class Subject {
    private String subjectName;

    public Subject(String subjectName) {
        if (subjectName == null) {
            throw new NullPointerException("Subject name must be not null.");
        }
        if (isEmpty(subjectName)) {
            throw new IllegalArgumentException("Subject name must not be empty.");
        }
        this.subjectName = subjectName.trim();
    }

    public String getSubjectName() {
        return subjectName;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public boolean equalTo(Subject other) {
        if (other == null) {
            throw new NullPointerException("Subject must be not null.");
        }
        return subjectName.equals(other.subjectName);
    }
}
