package emailservice;

public class Spam implements Email {
    private User to;
    private String subject;
    private String content;

    public Spam(User to, String subject, String content) {
        this.to = to;
        this.subject = subject;
        this.content = content;
    }

    @Override
    public User getTo() {
        return to;
    }

    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public User getFrom() {
        return new User("spam@spam.com");
    }
}
