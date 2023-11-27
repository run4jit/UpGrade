package TodoList.src;

import java.util.Scanner;

public class DeleteCommand implements OperatableCURD {
    private Command command = Command.Delete;
    private TodoListActionable list;

    @Override
    public void execute(Scanner scanner) {
        list.deleteTodoForId("100");
    }

    @Override
    public Command getCommand() {
        return command;
    }

    @Override
    public void setTodoList(TodoListActionable todoList) {
        list = todoList;
    }
}
