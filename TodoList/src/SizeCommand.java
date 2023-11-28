package TodoList.src;

public class SizeCommand implements Commendable {
    private Command command = Command.Size;
    private TodoListActionable list;

    @Override
    public void execute() {
        list.sizeOfTodoList();
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