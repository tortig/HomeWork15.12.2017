package StringLongestPrefix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = in.nextLine();

        maxPrefix(str);
    }

    //-------------------- Max Prefix-------------------------------
    private static void maxPrefix (String str) {
        int max = 0;
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {    // find longest prefix size
            if (Character.isDigit(str.charAt(i)))
                counter++;
            else {
                if (counter > max)
                    max = counter;
                counter = 0;
            }

            if (counter > max)
                max = counter;
        }

        counter = 0;

        for (int i = 0; i < str.length(); i++) {    // print longest prefix
            if (Character.isDigit(str.charAt(i))) {
                counter++;
                if (counter == max) {
                    System.out.println(str.substring(i - max + 1, i + 1));
                    counter = 0;
                }
            } else
                counter = 0;
        }

        System.out.println("Max length of prefix is : " + max);
    }

}
