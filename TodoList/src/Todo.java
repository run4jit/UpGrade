package TodoList.src;

public class Todo {
    private String year;
    private String month;
    private String day;
    private String id;
    private String task;
    private boolean isPending = false;

    Todo(String year, String month, String day, String id, String task) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.id = id;
        this.task = task;

    }

    public String getId() {
        return id;
    }

    public void setIsPending(boolean pending) {
        this.isPending = pending;
    }

    public boolean getIsPending() {
        return this.isPending;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
        return "Task (" + id + ") " + "is pending " + "form " + day + "/" + month + "/" + year;
    }

    public static Todo defaultTodo() {
        Todo todo = new Todo("2023", "11", "27", "100", "I have to complete the program.");
        return todo;
    }
}