package TodoList.src;

public class ResetCommand implements Commendable {
    private Command command = Command.Reset;
    private TodoListActionable list;

    /**
     * InnerResetCommand
     */
    public interface InnerResetCommand {
        void operation();

    }

    @Override
    public void execute() {
        list.resetTodoList();
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