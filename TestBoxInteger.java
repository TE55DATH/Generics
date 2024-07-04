package Generics;

import java.util.Scanner;

public class TestBoxInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            Box<Integer> box = new Box<>(input); // I explicitly use java.lang.Integer hehe
            System.out.println(box.toString());
        }

        scanner.close();
    }
}
