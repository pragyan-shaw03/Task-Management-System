package College;

import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String name;
    private String priority;
    private String deadline;
    private boolean completed;

    public Task(String name, String priority, String deadline) {
        this.name = name;
        this.priority = priority;
        this.deadline = deadline;
        this.completed = false;
    }

    public String getTitle() {
        return name;
    }

    public String getPriority() {
        return priority;
    }

    public String getDeadline() {
        return deadline;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setComplete() {
        this.completed = true;
    }
}

class TaskManager {
    ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            String checkComplete = task.isCompleted() ? "Completed" : "Incomplete";
            System.out.println((i + 1) + ". " + task.getTitle() + ".   Priority: " + task.getPriority() + ".   Deadline: " +
                    task.getDeadline() + ".   Status: " + checkComplete);
        }
    }
}

public class TaskQuest {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTaskQuest - Task Management System");
            System.out.println("1. View Tasks");
            System.out.println("2. Complete Task");
            System.out.println("3. Add Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    taskManager.displayTasks();
                    break;
                case "2":
                    System.out.print("Enter the index of the task to complete: ");
                    int taskIndex = scanner.nextInt() - 1;
                    if (taskIndex >= 0 && taskIndex < taskManager.tasks.size()) {
                        taskManager.tasks.get(taskIndex).setComplete();
                        System.out.println("Task completed successfully!");
                    } else {
                        System.out.println("Invalid task index.");
                    }
                    break;
                case "3":
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task priority (1 - 5): ");
                    String priority = scanner.nextLine();
                    System.out.print("Enter task deadline (YYYY-MM-DD): ");
                    String deadline = scanner.nextLine();
                    Task newTask = new Task(title, priority, deadline);
                    taskManager.addTask(newTask);
                    System.out.println("Task added successfully!");
                    break;
                case "4":
                    System.out.println("Exiting TaskQuest. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
