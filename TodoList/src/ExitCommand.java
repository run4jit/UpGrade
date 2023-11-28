package TodoList.src;

public class ExitCommand implements Commendable {
    private Command command = Command.Exit;
    private TodoListActionable list;

    @Override
    public void execute() {
        list.exit();
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
