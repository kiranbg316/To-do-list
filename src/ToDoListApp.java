import java.util.ArrayList;
import java.util.Scanner;  // Import Scanner class

public class ToDoListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        while (true) {
            System.out.println("\nOptions: 1) Add Task  2) View Tasks  3) Delete Task  4) Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.println("Enter the task: ");
                String task = scanner.nextLine();
                tasks.add(task);
            }
            else if (choice == 2){
                System.out.println("your to do list:");
                for (int i= 0;i < tasks.size(); i++){
                    System.out.println((i + 1) + "." + tasks.get(i) );
                }
            }
            else if (choice == 3) {  // Delete Task
                System.out.print("Enter task number to delete: ");
                int taskNumber = scanner.nextInt();
                if (taskNumber > 0 && taskNumber <= tasks.size()) {
                    tasks.remove(taskNumber - 1);
                    System.out.println("Task deleted.");
                } else {
                    System.out.println("Invalid task number.");
                }
            }
            else if (choice == 4) {  // Exit
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();

        }
    }




