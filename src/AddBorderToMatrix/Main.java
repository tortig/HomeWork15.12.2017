package AddBorderToMatrix;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        String str;

        System.out.println("Enter string or END");
        Scanner in = new Scanner(System.in);

        while (true) {          // input "END" and press enter to finish
            str = in.nextLine();
            if (str.equals("END"))
                break;
            else
                strings.add(str);
        }

        addBorder(strings);
    }

    private static void addBorder(ArrayList<String> strings) {
        if (strings.size() == 0)    // for empty array
            System.out.println(" ");
        else {                      // array is not empty
            System.out.print("[\"");          // first line
            for (int i = 0; i < strings.get(0).length()+2; i++)
                System.out.print("*");
            System.out.println("\",");

            for (String str : strings) {
                System.out.println(" \"*" + str + "*\",");
            }

            System.out.print(" \"");          // last line
            for (int i = 0; i < strings.get(0).length()+2; i++)
                System.out.print("*");
            System.out.println("\"]");
        }

    }
}
