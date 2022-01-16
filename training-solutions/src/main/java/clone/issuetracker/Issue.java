package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {
    private String name;
    private LocalDateTime time;
    private Status status;
    private List<Comment> comments = new ArrayList<>();

    public Issue(String name, LocalDateTime time, Status status) {
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public Issue(Issue issue, CopyMode copyMode) {
        this(issue.name, issue.time, issue.status);
        if (copyMode == CopyMode.WITH_COMMENTS) {
            for (Comment comment : issue.comments) {
                comments.add(new Comment(comment));
            }
        }
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public List<Comment> getComments() {
        return comments;
    }
}
