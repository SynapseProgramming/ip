import java.util.ArrayList;
import java.util.Scanner;

public class Duke {

  public static void main(String[] args) {

    String greeting = "Hello! I'm KimochiUsagi (きもち　うさぎ)!\n";
    String info = "Ask the bunny a question!\n";
    String goodbye = "Bye. See you again! (またね)";

    ArrayList<Task> taskList = new ArrayList<>();
    System.out.println(greeting);
    System.out.println(info);

    Scanner scanner = new Scanner(System.in);

    while (true) {
      String inputString = scanner.nextLine();
      String[] inputTokens = inputString.split(" ");

      // there is no input
      if (inputTokens.length == 0) {
        break;
      }

      String commandString = inputTokens[0];

      if (commandString.equals("bye")) {
        break;
      } else if (commandString.equals("list")) {

        for (int i = 0; i < taskList.size(); i++) {

          String index = Integer.toString(i + 1);
          Task selectectedTask = taskList.get(i);
          System.out.println(index + "\t" + "[" + selectectedTask.getDoneIcon() + "] "
              + selectectedTask.description);
        }
      } else if (commandString.equals("mark")) {
        int index = Integer.parseInt(inputTokens[1]);
        index--;
        System.out.println("Marked selected task as done");
        // set current task as done
        Task selectedTask = taskList.get(index);
        selectedTask.setDone();
        System.out.println("[" + selectedTask.getDoneIcon() + "] " + selectedTask.description);

      } else {
        taskList.add(new Task(inputString));
        System.out.println("added:\t" + inputString);
      }
    }

    System.out.println(goodbye);

  }
}
