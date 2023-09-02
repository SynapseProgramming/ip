package io;

import tasks.Deadline;
import tasks.Event;
import tasks.Task;
import tasks.Todo;

public class Ui {


  public void displayGreetings() {
    String greeting = "Hello! I'm KimochiUsagi (きもち　うさぎ)!\n";
    String info = "Ask the bunny a question!\n";
    System.out.println(greeting);
    System.out.println(info);
  }


  public String displayTask(Task task) {
    String answer = "";

    if (task instanceof Todo) {
      answer = "[" + Todo.taskType + "]" + "[" + task.getDoneIcon() + "] " + task.getDescription();
    } else if (task instanceof Deadline) {
      Deadline deadTask = (Deadline) task;

      answer =
          "[" + Deadline.taskType + "]" + "[" + task.getDoneIcon() + "] " + task.getDescription()
              + "("
              + deadTask.getDeadDate() + ")";

    } else if (task instanceof Event) {
      Event eventTask = (Event) task;

      answer =
          "[" + Event.taskType + "]" + "[" + task.getDoneIcon() + "] " + task.getDescription() + "("
              + eventTask.getStartDate() + " to " + eventTask.getEndDate() + ")";
    }

    return answer;
  }

}
