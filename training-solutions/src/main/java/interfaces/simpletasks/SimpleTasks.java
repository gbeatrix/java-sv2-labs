package interfaces.simpletasks;

import java.util.List;

public class SimpleTasks implements Runnable {
    private List<String> tasks;

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }

    private boolean nextStep() {
        if (hasNext()) {
            tasks.remove(tasks.size() - 1);
        }
        return hasNext();
    }

    private boolean hasNext() {
        return tasks != null && !tasks.isEmpty();
    }

    @Override
    public void run() {
        while (nextStep()) ;
    }
}
