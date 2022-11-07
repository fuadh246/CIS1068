import java.time.LocalDateTime;

public class TaskMain {
    public static void main(String[] args) {
        Task postHW = new Task("post 1068 homework", 1, 180); //
        LocalDateTime.of(2019, 3, 23, 13, 0);
        System.out.println(postHW.getName() + " assignment");

        System.out.println("This has priority " + postHW.getPriority() + ", should take me "
                + postHW.getEstMinsToComplete() + " minutes");
        System.out.println("and it's due on " + postHW.getWhenDue());

        // System.out.println(postHW.toString());
        // postHW.increasePriority(1);
        // System.out.println("Priority increased " + postHW.getPriority());
        // postHW.decreasePriority(1);
        // System.out.println("Priority decreased " + postHW.getPriority());
        // System.out.println();
        // System.out.println();
        // HoneyDoList honeydo = new HoneyDoList();
        // System.out.println(honeydo);
        // honeydo.addTask(new Task("post 1068 homework", 1, 160));
        // honeydo.addTask(new Task("Make Sandwiches", 2, 20));
        // honeydo.addTask(new Task("Water Plant", 1, 8));
        // System.out.println(honeydo);
        // System.out.println("Find Function [Water Plant] at index: " +
        // honeydo.find("Water Plant"));
        // System.out.println("Total time to finish work is " + honeydo.totalTime() +
        // " minutes");
        // System.out.println("Shortest time will take: " + honeydo.shortestTime());
        // honeydo.completeTask(1);
        // System.out.println("Task 1 done");
        // System.out.println(honeydo);
        // System.out.println("Task of index 0:\n" + honeydo.getTask(0));

    }
}