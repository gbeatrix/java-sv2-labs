package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {
    private final List<String> composer;
    private final int length;
    private final List<String> performers;
    private final String title;

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("missing title");
        }
        if (length <= 0) {
            throw new IllegalArgumentException("invalid length");
        }
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException("no performer");
        }

        this.title = title;
        this.length = length;
        this.performers = List.copyOf(performers);
        this.composer = List.copyOf(composer);
    }

    public AudioFeatures(String title, int length, List<String> performers) {
        this(title, length, performers, new ArrayList<>());
    }

    @Override
    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>(composer);
        contributors.addAll(performers);
        return contributors;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
