package TodoList.src;

import java.util.Scanner;

public class ReadCommand implements OperatableCURD {
    private Command command = Command.Read;
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
            list.readTodoForId(id);
        } finally {

        }
    }
}