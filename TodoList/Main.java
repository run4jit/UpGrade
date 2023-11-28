package TodoList;

import java.util.Scanner;

import TodoList.src.CommandFactory;
import TodoList.src.Commendable;
import TodoList.src.OperatableCURD;
import TodoList.src.TodoList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        TodoList list = new TodoList();
        // list.resetCommand.f

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Please Enter A Command.");
                System.out.println("Type \'help\' to read documntation...");

                String command = scanner.nextLine();

                if ((command.equals("create")) ||
                        (command.equals("read")) ||
                        (command.equals("updae")) ||
                        (command.equals("delete"))) {
                    OperatableCURD commandScannerObj = CommandFactory.createOperatableCommand(command);
                    if (commandScannerObj != null) {
                        commandScannerObj.setTodoList(list);
                        commandScannerObj.execute(scanner);
                    }
                } else {
                    Commendable commandObj = CommandFactory.createCommand(command);
                    if (commandObj != null) {
                        commandObj.setTodoList(list);
                        commandObj.execute();
                    }
                }

            }
        }

    }
}