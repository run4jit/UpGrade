package TodoList.src;

import java.util.Scanner;

public class DeleteCommand implements OperatableCURD {
    private Command command = Command.Delete;
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

    private void performExecute(Scanner scanner) {
        try {
            System.out.println("Enter Task ID");
            String id = scanner.nextLine();
            Todo todo = list.deleteTodoForId(id);
            System.out.println("Deleted item.");
            System.out.println(todo.toString());
        } finally {

        }

    }
}
