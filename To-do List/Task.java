import java.time.LocalDateTime;

public class Task {
    private String name;
    private int priority;
    private LocalDateTime whenDue;
    private int estMinsToComplete;

    public Task(String name, int priority, int estMinsToComplete) {
        this.name = name;
        this.priority = priority;
        this.estMinsToComplete = estMinsToComplete;
    }

    public Task(String name, int priority, LocalDateTime whenDue, int estMinsToComplete) {
        this.name = name;
        this.priority = priority;
        this.whenDue = whenDue;
        this.estMinsToComplete = estMinsToComplete;
    }

    public String getName() {
        return this.name;
    }

    public int getPriority() {
        return this.priority;
    }

    public LocalDateTime getWhenDue() {
        // return this.whenDue.format(DateTimeFormatter.RFC_1123_DATE_TIME);
        // return DateTimeFormatter.RFC_1123_DATE_TIME.format(whenDue);
        return this.whenDue;
    }

    public int getEstMinsToComplete() {
        return this.estMinsToComplete;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEstMinsToComplete(int estMinsToComplete) {
        this.estMinsToComplete = estMinsToComplete;
    }

    public String toString() {
        return "Name: " + name +
                "\nPriority: " + priority +
                "\nEst Mins To Complete: " + estMinsToComplete;
    }

    public int increasePriority(int amount) {
        if (amount <= 0) {
            return this.priority;
        } else {
            return this.priority += amount;
        }
    }

    public int decreasePriority(int amount) {
        if (priority <= amount) {
            return this.priority = 0;
        } else {
            return this.priority -= amount;
        }
    }
}