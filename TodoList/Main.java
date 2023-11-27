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

                // Help
                if (command.equals("help")) {

                }

                // Create
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

                // Updae
                if (command.equals("updae")) {

                }

                // delete
                if (command.equals("delete")) {

                }

                // List
                if (command.equals("list")) {

                }

                // Size
                if (command.equals("size")) {

                }

                // reset
                if (command.equals("reset")) {

                }

                // exit
                if (command.equals("exit")) {

                }

                // Read
                if (command.equals("read")) {

                }

            }
        }

    }
}