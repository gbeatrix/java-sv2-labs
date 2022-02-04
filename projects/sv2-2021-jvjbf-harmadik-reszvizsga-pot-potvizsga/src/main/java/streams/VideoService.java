package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VideoService {
    private List<Video> videos = new ArrayList<>();

    public void addVideo(Video video) {
        videos.add(video);
    }

    public List<Video> findVideosByTitle(String titlePart) {
        return videos.stream()
                .filter(v -> v.getTitle().contains(titlePart))
                .sorted(Comparator.comparing(Video::getUploadDate).reversed())
                .toList();
    }

    public long countVideosWithHashTag(String hashTag) {
        return videos.stream()
                .filter(v -> v.getHashTags().contains(hashTag))
                .count();
    }

    public Video firstVideoByDate() {
        return videos.stream()
                .min(Comparator.comparing(Video::getUploadDate))
                .orElseThrow(() -> new IllegalStateException("No videos in list!"));
    }

    public long sumOfVideoLengths() {
        return videos.stream()
                .map(Video::getLength)
                .reduce(0L, Long::sum, Long::sum);
    }
}
