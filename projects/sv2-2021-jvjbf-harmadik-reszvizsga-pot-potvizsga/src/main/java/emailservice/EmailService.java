package emailservice;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class EmailService {
    private Set<User> users = new LinkedHashSet<>();

    public Set<User> getUsers() {
        return users;
    }

    public void registerUser(String emailAddress) {
        int at;
        if ((at = emailAddress.indexOf('@')) <= 0 || emailAddress.indexOf('.', at + 2) < 0 || !emailAddress.equals(emailAddress.toLowerCase())) {
            throw new IllegalArgumentException("Email address is not valid: " + emailAddress);
        }
        User user = new User(emailAddress);
        if (getUser(emailAddress).isPresent()) {
            throw new IllegalArgumentException("Email address is already taken!");
        }
        users.add(user);
    }

    public void sendEmail(String from, String to, String subject, String content) {
        User fromUser = getUser(from).orElseThrow(() -> new IllegalArgumentException("Cannot find user " + from));
        User toUser = getUser(to).orElseThrow(() -> new IllegalArgumentException("Cannot find user " + to));
        fromUser.sendEmail(subject, content, toUser);
    }

    public void sendSpam(String subject, String content) {
        users.forEach(u -> u.getEmail(new Spam(u, subject, content)));
    }

    private Optional<User> getUser(String emailAddress) {
        return users.stream().filter(u -> u.getEmailAddress().equals(emailAddress)).findAny();
    }
}
