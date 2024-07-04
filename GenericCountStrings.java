package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenericCountStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String element = scanner.nextLine();
            stringList.add(element);
        }

        String valueToCompare = scanner.nextLine();
        int count = countGreaterThan(stringList, valueToCompare);
        System.out.println(count);
    }
    public static <T extends Comparable<T>> int countGreaterThan(List<T> list, T value) {
        int count = 0;
        for (T element : list) {
            if (element.compareTo(value) > 0) {
                count++;
            }
        }
        return count;
    }
}
