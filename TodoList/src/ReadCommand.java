package TodoList.src;

import java.util.Scanner;

public class ReadCommand implements OperatableCURD {
    private Command command = Command.Read;
    private TodoListActionable list;

    @Override
    public void execute(Scanner scanner) {
        list.readTodoForId("100");
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