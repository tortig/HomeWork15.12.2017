package CheckIPaddress;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ip = in.nextLine();          // initialize IP
        boolean flag = true;

        String[] parts = ip.split("\\.");

        for (String str : parts) {
            if (!isInt(str)) {
                flag = false;
                break;
            } else {
                int temp = Integer.parseInt(str);
                if (temp < 0 || temp > 255) {
                    flag = false;
                    break;
                }
            }
        }

        System.out.println(flag);
    }

    private static boolean isInt(String str) {
        try {
            int i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
