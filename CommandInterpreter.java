package Generics;

import java.util.Scanner;

public class CommandInterpreter {
    public static void main(String[] args) {
        CommandInterpreter interpreter = new CommandInterpreter();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String command = scanner.nextLine().trim();
            if (command.equals("end")) {
                break;
            }
            interpreter.interpretCommand(command);
        }

        scanner.close();
    }

    private CustomList<String> customList;

    public CommandInterpreter() {
        this.customList = new CustomList<>();
    }

    public void interpretCommand(String command) {
        String[] tokens = command.split("\\s+");

        switch (tokens[0]) {
            case "Add":
                customList.add(tokens[1]);
                break;
            case "Remove":
                int indexToRemove = Integer.parseInt(tokens[1]);
                customList.remove(indexToRemove);
                break;
            case "Contains":
                String elementToCheck = tokens[1];
                System.out.println(customList.contains(elementToCheck));
                break;
            case "Swap":
                int index1 = Integer.parseInt(tokens[1]);
                int index2 = Integer.parseInt(tokens[2]);
                customList.swap(index1, index2);
                break;
            case "Greater":
                String elementToCompare = tokens[1];
                int countGreater = customList.countGreaterThan(elementToCompare);
                System.out.println(countGreater);
                break;
            case "Max":
                System.out.println(customList.getMax());
                break;
            case "Min":
                System.out.println(customList.getMin());
                break;
            case "Print":
                customList.print();
                break;
            case "end":
                return; // Exit command interpreter
            default:
                System.out.println("Invalid command");
                break;
        }
    }
}

