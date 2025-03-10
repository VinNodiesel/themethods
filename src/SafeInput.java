import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print(prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.trim().isEmpty());
        return retString;
    }
    public static int getInt(Scanner pipe, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine();
                return value;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.nextLine();
            }
        }
    }
    public static double getDouble(Scanner pipe, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine();
                return value;
            } else {
                System.out.println("Invalid input. Please enter a valid decimal number.");
                pipe.nextLine();
            }
        }
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int value;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine();
                if (value >= low && value <= high) {
                    return value;
                } else {
                    System.out.println("Out of range. Try again.");
                }
            } else {
                System.out.println("Invalid input. Enter a number between " + low + " and " + high + ".");
                pipe.nextLine();
            }
        } while (true);
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double value;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine();
                if (value >= low && value <= high) {
                    return value;
                } else {
                    System.out.println("Out of range. Try again.");
                }
            } else {
                System.out.println("Invalid input. Enter a decimal number between " + low + " and " + high + ".");
                pipe.nextLine();
            }
        } while (true);
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String input;
        do {
            System.out.print(prompt + " (Y/N): ");
            input = pipe.nextLine().trim().toLowerCase();
            if (input.equals("y")) return true;
            if (input.equals("n")) return false;
            System.out.println("Invalid input. Please enter Y or N.");
        } while (true);
    }
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;
        do {
            System.out.print(prompt + ": ");
            input = pipe.nextLine();
            if (input.matches(regEx)) return input;
            System.out.println("Invalid input. Try again.");
        } while (true);
    }
    public static void prettyHeader(String msg) {
        int width = 60;
        int padding = (width - msg.length() - 6) / 2;
        System.out.println("*".repeat(width));
        System.out.println("***" + " ".repeat(padding) + msg + " ".repeat(padding) + "***");
        System.out.println("*".repeat(width));
    }
}
