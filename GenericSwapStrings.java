package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenericSwapStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            stringList.add(input);
        }

        String swapCommand = scanner.nextLine();
        String[] swapIndexes = swapCommand.split(" ");
        int index1 = Integer.parseInt(swapIndexes[0]);
        int index2 = Integer.parseInt(swapIndexes[1]);

        swap(stringList, index1, index2);

        for (String str : stringList) {
            System.out.println("java.lang.String: " + str);
        }
    }

    public static <T> void swap(List<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
