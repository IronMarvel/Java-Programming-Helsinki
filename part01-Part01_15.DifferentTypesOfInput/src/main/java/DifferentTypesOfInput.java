
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String str = scanner.nextLine();
        System.out.println("Give an integer:");
        int in = Integer.parseInt(scanner.nextLine());
        System.out.println("Give a double:");
        double doub = Double.parseDouble(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean bool = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + in);
        System.out.println("You gave the double " + doub);
        System.out.println("You gave the boolean " + bool);
    }
}
