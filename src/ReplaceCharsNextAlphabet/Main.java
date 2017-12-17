package ReplaceCharsNextAlphabet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = in.nextLine();

        changer(str);
    }

    //-----------------------Changer-------------------------------
    private static void changer (String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (letter == 'z')
                result.append('a');
            else
                result.append((char)(letter + 1));
        }

        System.out.println(result);
    }
}
