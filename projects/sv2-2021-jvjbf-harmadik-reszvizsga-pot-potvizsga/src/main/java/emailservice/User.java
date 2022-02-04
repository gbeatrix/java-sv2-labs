package emailservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String emailAddress;
    private List<Email> incoming = new ArrayList<>();
    private List<Email> sent = new ArrayList<>();
    private boolean hasSpamFilter;

    public User(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void getEmail(Email email) {
        if (hasSpamFilter && email.getFrom().getEmailAddress().contains("spam")) {
            throw new IllegalStateException("Be careful, tis is a spam!");
        }
        if (email.isImportant()) {
            incoming.add(0, email);
        } else {
            incoming.add(email);
        }
    }

    public List<Email> getIncoming() {
        return List.copyOf(incoming);
    }

    public List<Email> getSent() {
        return List.copyOf(sent);
    }

    public boolean hasSpamFilter() {
        return hasSpamFilter;
    }

    public void sendEmail(String subject, String content, User to) {
        Email email = new Normal(this, to, subject, content);
        sent.add(email);
        to.getEmail(email);
    }

    public void spamFilterChange() {
        hasSpamFilter = !hasSpamFilter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(emailAddress, user.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAddress);
    }
}
