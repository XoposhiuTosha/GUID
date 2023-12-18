import java.util.Scanner;
import java.util.regex.Pattern;

public class GUID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String expression = scanner.nextLine();

        if (isValidGUID(expression)) {
            System.out.println("Данная строка является GUID");
        } else {
            System.out.println("Данная строка не является GUID");
        }
    }

    public static boolean isValidGUID(String expression) {

        boolean hasBrackets = expression.startsWith("{") && expression.endsWith("}");

        String guid = hasBrackets ? expression.substring(1, expression.length() - 1) : expression;

        String pattern = "^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}$";
        return Pattern.matches(pattern, guid);
    }
}
