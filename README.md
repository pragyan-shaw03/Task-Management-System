# Task-Management-System
Task Management System using java
# TaskQuest - Task Management Application

## Introduction
TaskQuest is a simple command-line task management application designed to help users organize their tasks effectively. It allows users to add, view, and complete tasks with ease. The application is written in Java and utilizes object-oriented programming principles to maintain a clean and modular codebase.

## Classes

### Task
The `Task` class represents an individual task with the following attributes:
- `name`: Name or title of the task.
- `priority`: Priority level of the task (High, Medium, Low).
- `deadline`: Deadline of the task in the format YYYY-MM-DD.
- `completed`: Boolean value indicating whether the task has been completed or not.

The class provides methods to retrieve task details (`getTitle()`, `getPriority()`, `getDeadline()`, `isCompleted()`) and mark a task as completed (`setComplete()`).

### TaskManager
The `TaskManager` class manages a collection of tasks and provides methods to perform operations on them. It contains the following attributes and methods:
- `tasks`: An ArrayList to store Task objects.

#### Methods:
- `addTask(Task task)`: Adds a new task to the task list.
- `completeTask(int taskIndex)`: Marks the task at the specified index as completed.
- `displayTasks()`: Displays all tasks along with their details.

### TaskQuest
The `TaskQuest` class contains the main method and serves as the entry point for the application. It provides a command-line interface for users to interact with the TaskManager and perform various actions such as viewing tasks, completing tasks, and adding new tasks.

#### User Interface:
- The user is presented with a menu of options:
    1. View Tasks: Displays all existing tasks.
    2. Complete Task: Marks a task as completed.
    3. Add Task: Allows the user to add a new task.
    4. Exit: Terminates the application.

## How to Use
To use the TaskQuest application, follow these steps:
1. Compile the `TaskQuest.java` file using a Java compiler (`javac TaskQuest.java`).
2. Run the compiled program (`java TaskQuest`).
3. Follow the on-screen instructions to perform various tasks such as viewing, completing, and adding tasks.

## Contributions
Contributions to TaskQuest are welcome! Feel free to submit bug reports, feature requests, or pull requests via GitHub.

## License
This project is licensed under the MIT License - see the `LICENSE` file for details.

