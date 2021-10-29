package stringbasic;

public class Person {
    private String name;
    private String email;
    private String taj;
    private String bankAcc;
    private String tel;

    public Person(String name, String email, String taj, String bankAcc, String tel) {
        this.name = name;
        this.email = email;
        this.taj = taj;
        this.bankAcc = bankAcc;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTaj() {
        return taj;
    }

    public void setTaj(String taj) {
        this.taj = taj;
    }

    public String getBankAcc() {
        return bankAcc;
    }

    public void setBankAcc(String bankAcc) {
        this.bankAcc = bankAcc;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
