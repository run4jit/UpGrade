package TodoList.src;

public class ListTodoCommand implements Commendable {
    private Command command = Command.List;
    private TodoListActionable list;

    @Override
    public Command getCommand() {
        return command;
    }

    @Override
    public void setTodoList(TodoListActionable todoList) {
        list = todoList;
    }

    @Override
    public void execute() {
        list.listAllTodo();
    }

}
