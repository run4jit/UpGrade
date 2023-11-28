package TodoList.src;

import java.util.Random;
import java.util.Scanner;

public class CreateCommand implements OperatableCURD {
    private Command command = Command.Create;
    private TodoListActionable list;

    @Override
    public void execute(Scanner scanner) {
        performExecute(scanner);
    }

    @Override
    public Command getCommand() {
        return command;
    }

    @Override
    public void setTodoList(TodoListActionable todoList) {
        list = todoList;
    }

    private String randomGeneratedId() {
        Random random = new Random();
        return String.valueOf(random.nextInt(1000));
    }

    private void performExecute(Scanner scanner) {
        try {
            System.out.println("Enter Year");
            String year = scanner.nextLine();
            System.out.println("Enter Month");
            String month = scanner.nextLine();
            System.out.println("Enter day");
            String day = scanner.nextLine();
            System.out.println("Enter Task");
            String task = scanner.nextLine();
            String id = randomGeneratedId();
            Todo todo = new Todo(year, month, day, id, task);

            System.out.println("Todo task generated.");
            System.out.println(todo.toString());

            list.createTodoList(todo);
        } finally {

        }

    }

}
