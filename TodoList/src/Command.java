package TodoList.src;

import java.lang.StackWalker.Option;
import java.util.HashMap;
import java.util.Map;

public enum Command implements Labled {
    Create("create"),
    Update("update"),
    List("list"),
    Help("help"),
    Exit("exit"),
    Read("read"),
    Reset("reset"),
    Size("size"),
    Delete("delete");

    private static final Map<String, Command> BY_LABEL = new HashMap<>();
    private final String label;

    private Command(String label) {
        this.label = label;

    }

    static {
        for (Command e : values()) {
            BY_LABEL.put(e.label, e);
        }
    }

    public static Command valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }

    @Override
    public String label() {
        return label;
    }

}
