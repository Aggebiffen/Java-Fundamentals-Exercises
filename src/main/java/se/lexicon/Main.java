package se.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercise_1();
        exercise_2();
        exercise_3();
        exercise_4();
        exercise_5();
        exercise_6();
    }

    public static void exercise_1() {
        System.out.println("Hello");
        System.out.println("August!");
    }

    public static void exercise_2() {
        int year = 2024;
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = (year % 400 == 0);

        if (x && (y || z)) {
            System.out.printf(year + " is a leap year");
        } else
            System.out.printf(year + " is not a leap year");
    }

    public static void exercise_3() {
        int num1 = 110;
        int num2 = 55;

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }
    public static void exercise_5() {
        Scanner user_input = new Scanner(System.in);

        String name;
        System.out.println("What's your name?");
        name = user_input.next();
        System.out.println("Hello " + name);

    }
    public static void exercise_4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Input the second number:");
        double num2 = scanner.nextDouble();
        System.out.println("Input the third number: ");
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3) / 3;

        System.out.println("The average of the three numbers is: " + average);
    }

    public static void exercise_6() {
        Scanner user_input = new Scanner(System.in);

        System.out.println("Enter first number :");
        double num1 = user_input.nextDouble();

        System.out.println("Enter second number :");
        double num2 = user_input.nextDouble();

        double sum = num1 + num2;
        double product = num1 * num2;
        double division = num1 / num2;
        double subtraction = num1 - num2;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("division: " + division);
        System.out.println("subtraction: " + subtraction);
    }


}
