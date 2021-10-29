package stringbasic;

public class Student {
    private Person person;
    private String neptun;
    private String eduId;
    private String entryCode;

    public Student(Person person, String neptun, String eduId) {
        this.person = person;
        this.neptun = neptun;
        this.eduId = eduId;
    }

    @Override
    public String toString() {
        return person.getName() + " (" + neptun + ")";
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptun() {
        return neptun;
    }

    public void setNeptun(String neptun) {
        this.neptun = neptun;
    }

    public String getEduId() {
        return eduId;
    }

    public void setEduId(String eduId) {
        this.eduId = eduId;
    }

    public String getEntryCode() {
        return entryCode;
    }

    public void setEntryCode(String entryCode) {
        this.entryCode = entryCode;
    }
}
