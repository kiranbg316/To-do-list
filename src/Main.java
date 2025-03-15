import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add(" 1hr exercise");
        tasks.add("study java");
        tasks.add("study sql");
        tasks.add("study dsa");
        System.out.println("your todolist:");
     for (int i = 0; i < tasks.size();i++) {
         System.out.println((i + 1) + "." + tasks.get(i));
     }
    }
    }


