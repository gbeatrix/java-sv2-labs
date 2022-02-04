package contentsite;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class ContentService {
    private Set<User> allUsers = new LinkedHashSet<>();
    private Set<Content> allContent = new LinkedHashSet<>();

    public void registerUser(String name, String password) {
        if (allUsers.stream().noneMatch(c -> c.getUserName().equals(name))) {
            allUsers.add(new User(name, password));
        } else {
            throw new IllegalArgumentException("Username is already taken: " + name);
        }
    }

    public Set<User> getAllUsers() {
        return Set.copyOf(allUsers);
    }

    public Set<Content> getAllContent() {
        return Set.copyOf(allContent);
    }

    public void addContent(Content content) {
        if (allContent.stream().noneMatch(c -> c.getTitle().equals(content.getTitle()))) {
            allContent.add(content);
        } else {
            throw new IllegalArgumentException("Content name is already taken: " + content.getTitle());
        }
    }

    public void logIn(String username, String password) {
        User user = getUser(username).orElseThrow(() -> new IllegalArgumentException("Username is wrong!"));
        if (user.getPassword() != User.getHash(username, password)) {
            throw new IllegalArgumentException("Password is Invalid!");
        }
        user.setLogIn(true);
    }

    private Optional<User> getUser(String username) {
        return allUsers.stream()
                .filter(user -> user.getUserName().equals(username))
                .findFirst();
    }

    public void clickOnContent(User user, Content content) {
        if (!user.isLogIn()) {
            throw new IllegalStateException("Log in to watch this content!");
        } else if (content.isPremiumContent() && !user.isPremiumMember()) {
            throw new IllegalStateException("Upgrade for Premium to watch this content!");
        } else {
            content.click(user);
        }
    }
}
