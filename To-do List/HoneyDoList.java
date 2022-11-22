import java.time.LocalDateTime;

public class HoneyDoList {
    private Task tasks[];
    private int numTasks;
    private int INITIAL_CAPACITY = 5;

    public HoneyDoList() {
        this.tasks = new Task[INITIAL_CAPACITY];
        this.numTasks = 0;
    }

    public String toString() {
        System.out.println("\nTasks: \n");
        String Tasks_ = "";
        for (int i = 0; i < numTasks; i++) {
            if (tasks[i] != null) {
                Tasks_ += "------------------------\n"
                        + tasks[i].toString()
                        + "\n------------------------\n";
            }
        }
        return Tasks_;
    }

    public int find(String name) {
        for (int i = 0; i < numTasks; i++) {
            if (tasks[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public void addTask(Task task) {

        if (tasks.length == numTasks) {
            Task Temp[] = new Task[numTasks + 1];

            for (int i = 0; i < tasks.length; i++) {
                Temp[i] = tasks[i];
            }
            tasks = Temp;
            tasks[numTasks] = task;
            numTasks += 1;
        } else {
            tasks[numTasks] = task;
            numTasks += 1;
        }
    }

    public int totalTime() {
        int totalTime = 0;
        for (int i = 0; i < numTasks; i++) {
            totalTime += tasks[i].getEstMinsToComplete();
        }
        return totalTime;
    }

    public int shortestTime() {
        int shortestTime = tasks[0].getEstMinsToComplete();
        int index = -1;
        for (int i = 0; i < numTasks; i++) {
            if (shortestTime >= tasks[i].getEstMinsToComplete()) {
                shortestTime = tasks[i].getEstMinsToComplete();
                index = i;
            }
        }
        return index;
    }

    public void completeTask(int index) {
        for (int i = index; i < tasks.length - 1; i++) {
            tasks[i] = tasks[i + 1];
        }
    }

    public Task getTask(int index) {
        return tasks[index];
    }

    public Task[] overdueTasks() {
        Task overDue[] = new Task[numTasks];
        LocalDateTime now = LocalDateTime.now();
        for (int i = 0; i < numTasks; i++) {
            if (tasks[i].getWhenDue().compareTo(now) > 0) {
                overDue[i] = tasks[i];
            }
        }
        System.out.println();
        return overDue;
    }
}