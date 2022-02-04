package contentsite;

public class User {
    private String userName;
    private int password;
    private boolean premiumMember;
    private boolean logIn;

    public String getUserName() {
        return userName;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = getHash(userName, password);
    }

    public static int getHash(String name, String password) {
        return (name + password).hashCode();
    }

    public int getPassword() {
        return password;
    }

    public boolean isLogIn() {
        return logIn;
    }

    public boolean isPremiumMember() {
        return premiumMember;
    }

    public void upgradeForPremium() {
        premiumMember = true;
    }

    public void setLogIn(boolean value) {
        this.logIn = value;
    }
}
