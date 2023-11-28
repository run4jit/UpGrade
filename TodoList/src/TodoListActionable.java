package TodoList.src;

public interface TodoListActionable {
    public void createTodoList(Todo todo);

    public void updateTodoList(Todo todo);

    public Todo readTodoForId(String id);

    public Todo deleteTodoForId(String id);

    public int sizeOfTodoList();

    public void resetTodoList();

    public void listAllTodo();

    public void exit();

    public void help();

}
