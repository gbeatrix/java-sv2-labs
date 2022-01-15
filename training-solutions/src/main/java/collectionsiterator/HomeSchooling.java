package collectionsiterator;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HomeSchooling {
    private List<OnlineLesson> lessons = new LinkedList<>();

    public void addNewLesson(OnlineLesson lesson) {
        Iterator<OnlineLesson> it = lessons.iterator();
        int index = 0;
        while (it.hasNext() && it.next().getStartTime().isBefore(lesson.getStartTime())) {
            index++;
        }
        lessons.add(index, lesson);
    }

    public List<OnlineLesson> getLessons() {
        return List.copyOf(lessons);
    }

    public List<OnlineLesson> getLessonsByTitle(String title) {
        List<OnlineLesson> result = new LinkedList<>();
        Iterator<OnlineLesson> it = lessons.iterator();
        while (it.hasNext()) {
            OnlineLesson actual = it.next();
            if (actual.getLessonTitle().equals(title)) {
                result.add(actual);
            }
        }
        return result;
    }

    public void removeLesson(LocalDateTime startTime) {
        Iterator<OnlineLesson> it = lessons.iterator();
        while (it.hasNext()) {
            if (it.next().getStartTime().equals(startTime)) {
                it.remove();
            }
        }
    }
}
