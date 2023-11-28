package TodoList.src;

public class CommandFactory {
    public static Commendable createCommand(String type) {
        Command command = Command.valueOfLabel(type);
        switch (command) {
            case Exit:
                return new ExitCommand();
            case Size:
                return new SizeCommand();
            case Help:
                return new HelpCommand();
            case Reset:
                return new ResetCommand();
            case List:
                return new ListTodoCommand();
            default:
                return new HelpCommand();
        }

    }

    public static OperatableCURD createOperatableCommand(String type) {
        Command command = Command.valueOfLabel(type);
        switch (command) {
            case Create:
                return new CreateCommand();
            case Read:
                return new ReadCommand();
            case Update:
                return new UpdateCommand();
            case Delete:
                return new DeleteCommand();
            default:
                return new HelpCommand();
        }

    }
}
