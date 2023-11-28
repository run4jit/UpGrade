package TodoList.src;

import java.util.Scanner;

public class UpdateCommand implements OperatableCURD {
    private Command command = Command.Update;
    private TodoListActionable list;

    @Override
    public void execute(Scanner scanner) {
        Todo todo = Todo.defaultTodo();
        todo.setTask("I have updated my programe.");
        list.updateTodoList(todo);
    }

    @Override
    public Command getCommand() {
        return command;
    }

    @Override
    public void setTodoList(TodoListActionable todoList) {
        list = todoList;
    }

    private void performExecute(Scanner scanner) {
        try {
            System.out.println("Enter Year");
            String year = scanner.nextLine();
            System.out.println("Enter Month");
            String month = scanner.nextLine();
            System.out.println("Enter day");
            String day = scanner.nextLine();
            System.out.println("Enter Id");
            String id = scanner.nextLine();
            System.out.println("Enter Task");
            String task = scanner.nextLine();

            if (list.isTaskExistForId(id)) {
                Todo todo = new Todo(year, month, day, id, task);
                list.updateTodoList(todo);
                System.out.println("Todo task updated.");
                System.out.println(todo.toString());
            }
        } finally {

        }

    }
}
