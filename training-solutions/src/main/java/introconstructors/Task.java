package introconstructors;

import java.time.LocalDateTime;

public class Task {
    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private int duration;

    /* Fordítsd le az osztályt, és nyisd meg az editorban a Task.class fájlt!
     * Van benne konstruktor? -> Igen.
     * Ha van, mi a tartalma? -> public Task() { }
     */

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    /* Fordítás után újra nézd meg a Task.class fájl tartalmát!
     * Milyen és hány konstruktor van benne? -> Már nincs benne paraméter nélküli, hanem csak az általam írt konstruktora van.
     */

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void start(){
        startDateTime = LocalDateTime.now();
    }

    public static void main(String[] args) {
        Task task = new Task("bevásárlás", "tej, kenyér, szalonna, krumpli, tojás, felvágott");
        task.setDuration(30);
        task.start();

        System.out.println("feladat: " + task.getTitle());
        System.out.println("leírás: " + task.getDescription());
        System.out.println("időtartam: " + task.getDuration() + " perc");
        System.out.println("kezdés: " + task.getStartDateTime());
    }
}
