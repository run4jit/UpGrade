package TodoList.src;

import java.util.Scanner;

public class HelpCommand implements Commendable, OperatableCURD {
    private Command command = Command.Help;
    private TodoListActionable list;

    @Override
    public void execute() {
        list.help();
    }

    @Override
    public void execute(Scanner scanner) {

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
