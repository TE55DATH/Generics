package Generics;

import java.util.Scanner;

public class TestBoxString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Box<String> box = new Box<>(input); // I explicitly use java.lang.String haha
            System.out.println(box.toString());
        }

        scanner.close();
    }
}
