package schoolrecords;

public class StudyResultByName {
    private String studentName;
    private double studyAverage;

    public StudyResultByName(String studentName, double studyAverage) {
        if (studentName == null) {
            throw new NullPointerException("Student name must be not null.");
        }
        if (isEmpty(studentName)) {
            throw new IllegalArgumentException("Student name must not be empty.");
        }
        this.studentName = studentName;
        this.studyAverage = studyAverage;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return studyAverage;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }
}
