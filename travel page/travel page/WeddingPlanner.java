import java.util.ArrayList;
import java.util.Scanner;

// Class to represent a Guest
class Guest {
    private String name;
    private boolean isInvited;

    public Guest(String name) {
        this.name = name;
        this.isInvited = false; // Initially, the guest is not invited
    }

    public String getName() {
        return name;
    }

    public boolean isInvited() {
        return isInvited;
    }

    public void invite() {
        isInvited = true; // Mark the guest as invited
    }

    @Override
    public String toString() {
        return name + (isInvited ? " (Invited)" : " (Not Invited)");
    }
}

// Class to represent a Task
class Task {
    private String taskName;
    private boolean isCompleted;

    public Task(String taskName) {
        this.taskName = taskName;
        this.isCompleted = false; // Task is initially not completed
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void completeTask() {
        isCompleted = true; // Mark the task as completed
    }

    @Override
    public String toString() {
        return taskName + (isCompleted ? " (Completed)" : " (Pending)");
    }
}

// Main class for the Wedding Planner
public class WeddingPlanner {
    private ArrayList<Guest> guests; // List to store guests
    private ArrayList<Task> tasks; // List to store tasks

    public WeddingPlanner() {
        guests = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    // Method to add a guest
    public void addGuest(String name) {
        guests.add(new Guest(name)); // Add a new guest to the list
        System.out.println(name + " has been added to the guest list.");
    }

    // Method to invite a guest
    public void inviteGuest(String name) {
        for (Guest guest : guests) {
            if (guest.getName().equalsIgnoreCase(name)) {
                guest.invite(); // Invite the guest
                System.out.println(name + " has been invited.");
                return;
            }
        }
        System.out.println(name + " not found in the guest list.");
    }

    // Method to add a task
    public void addTask(String taskName) {
        tasks.add(new Task(taskName)); // Add a new task to the list
        System.out.println("Task \"" + taskName + "\" has been added.");
    }

    // Method to complete a task
    public void completeTask(String taskName) {
        for (Task task : tasks) {
            if (task.getTaskName().equalsIgnoreCase(taskName)) {
                task.completeTask(); // Mark the task as completed
                System.out.println("Task \"" + taskName + "\" has been completed.");
                return;
            }
        }
        System.out.println("Task \"" + taskName + "\" not found.");
    }

    // Method to display all guests
    public void displayGuests() {
        System.out.println("\nGuest List:");
        for (Guest guest : guests) {
            System.out.println(guest);
        }
    }

    // Method to display all tasks
    public void displayTasks() {
        System.out.println("\nTask List:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeddingPlanner planner = new WeddingPlanner();
        String command;

        // Main loop for user interaction
        do {
            System.out.println("\n--- Wedding Planner Menu ---");
            System.out.println("1. Add Guest");
            System.out.println("2. Invite Guest");
            System.out.println("3. Add Task");
            System.out.println("4. Complete Task");
            System.out.println("5. Display Guests");
            System.out.println("6. Display Tasks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            command = scanner.nextLine();
        }

            // Handling user commands
            switch (command) {
                case "1":
                    System.out.print("Enter guest name: ");
                    String guestName = scanner.nextLine();
                    planner.addGuest(guestName);
                    break;
                case "2":
                    System.out.print("Enter guest name to invite: ");
                    String inviteName = scanner.nextLine();
                    planner.inviteGuest(inviteName);
                    break;
                case "3":
            }