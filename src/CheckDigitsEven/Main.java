package CheckDigitsEven;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer bigger than 0");
        int number = in.nextInt();

        evenDigitsOnlyIteration(number);    // use iteration

        evenDigitsOnlyRecursion(number);    // use recursion
    }

    //-----------------------Using Iteration---------------------------
    private static void evenDigitsOnlyIteration(int number) {
        if (number < 1)
            System.out.println("Wrong integer");

        while (true) {
            if (number / 10 > 0) {
                if (number % 2 == 1) {
                    System.out.println(false);
                    break;
                } else
                    number /= 10;
            } else {
                if (number % 2 == 1) {
                    System.out.println(false);
                    break;
                } else {
                    System.out.println(true);
                    break;
                }
            }
        }
    }

    //-----------------------Using Recursion---------------------------
    private static void evenDigitsOnlyRecursion(int number) {
        if (number < 1)
            System.out.println("Wrong integer");

        if (number / 10 == 0) {
            if (number % 2 == 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } else {
            evenDigitsOnlyRecursion(number / 10);
        }
    }
}
