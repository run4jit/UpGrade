package TodoList.src;

import java.util.Scanner;

public class CreateCommand implements OperatableCURD {
    private Command command = Command.Create;
    private TodoListActionable list;

    @Override
    public void execute(Scanner scanner) {
        Todo todo = Todo.defaultTodo();
        list.createTodoList(todo);
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
