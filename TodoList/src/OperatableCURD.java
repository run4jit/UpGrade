package TodoList.src;

import java.util.Scanner;

public interface OperatableCURD extends GetCommendableType, AssinableTodoList {
    public void execute(Scanner scanner);

    public static OperatableCURD createCommand(String command) {
        return null;
    }
}
