package schoolrecords;

public enum MarkType {
    A(5, "excellent"),
    B(4, "very good"),
    C(3, "improvement needed"),
    D(2, "close fail"),
    F(1, "fail");

    private int grade;
    private String evaluation;

    MarkType(int grade, String evaluation) {
        this.grade = grade;
        this.evaluation = evaluation;
    }

    public int getGrade() {
        return grade;
    }

    public String getEvaluation() {
        return evaluation;
    }
}
