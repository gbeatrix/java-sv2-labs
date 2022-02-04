package emailservice;

public class Normal implements Email {
    private User from;
    private User to;
    private String subject;
    private String content;

    public Normal(User from, User to, String subject, String content) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.content = content;
    }

    @Override
    public User getFrom() {
        return from;
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
    public boolean isImportant() {
        return subject.toLowerCase().contains("important");
    }
}
