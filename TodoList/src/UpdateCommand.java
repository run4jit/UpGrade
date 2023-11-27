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
}
