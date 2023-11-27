package TodoList.src;

import java.util.HashMap;
import java.util.Map;

/**
 * TodoList
 */

public class TodoList implements TodoListActionable {

    private Map<String, Todo> todoList = new HashMap<>();

    private void addTodo(Todo todo) {
        todoList.put(todo.getId(), todo);
    }

    private Todo removeForId(String id) {
        Todo item = todoList.remove(id);
        if (item == null) {
            System.out.println("Unable to delete todo item for id " + id);
        }
        return item;
    }

    private Todo readForId(String id) {
        Todo item = todoList.get(id);
        if (item == null) {
            System.out.println("Unable to read todo item for id " + id);
        }
        return item;
    }

    private void reset() {
        todoList.clear();
        this.help();
    }

    private void update(Todo todo) {
        todoList.replace(todo.getId(), todo);
    }

    private void list() {
        for (Todo todo : this.todoList.values()) {
            System.out.println(todo.toString());
        }
    }

    int size() {
        return todoList.size();
    }

    @Override
    public void createTodoList(Todo todo) {
        addTodo(todo);
    }

    @Override
    public void updateTodoList(Todo todo) {
        update(todo);
    }

    @Override
    public Todo readTodoForId(String id) {
        return readForId(id);
    }

    @Override
    public Todo deleteTodoForId(String id) {
        return removeForId(id);
    }

    @Override
    public int sizeOfTodoList() {
        return size();
    }

    @Override
    public void resetTodoList() {
        reset();
    }

    @Override
    public void listAllTodo() {
        list();
    }

    @Override
    public void exit() {
        System.out.println("exit");
        System.exit(0);
    }

    @Override
    public void help() {

        System.out.println("create - create a new to do list");
        System.out.println("list - list all of the to do items");
        System.out.println("read - read a todo list item by item number");
        System.out.println("update - update a to do list item by item number");
        System.out.println("delete - delete a to do list itme by item number");
        System.out.println("size - get total to do items count");
        System.out.println("restart - restart the application (all data lost)");
        System.out.println("exit - exit the application");
        System.out.println("help - get helpful information about the commands");
    }

}