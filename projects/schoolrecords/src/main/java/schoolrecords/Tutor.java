package schoolrecords;

import java.util.List;

public class Tutor {
    private String name;
    private List<Subject> taughtSubjects;

    public Tutor(String name, List<Subject> taughtSubjects) {
        if (name == null || taughtSubjects == null) {
            throw new NullPointerException("Both name and taught subjects must be provided.");
        }
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Tutor's name must be not empty.");
        }
        this.name = name.trim();
        this.taughtSubjects = taughtSubjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        if (subject == null) {
            throw new NullPointerException("Subject must be not null.");
        }
        for (Subject taughtSubject : taughtSubjects) {
            if (subject.equalTo(taughtSubject)) {
                return true;
            }
        }
        return false;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }
}
