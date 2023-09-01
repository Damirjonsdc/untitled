public class Main {
    import java.util.Scanner;

    public class UserInput {
        public static float getUserInput() {
            Scanner scanner = new Scanner(System.in);
            float number = 0.0f;
            boolean isValidInput = false;

            while (!isValidInput) {
                try {
                    System.out.print("Введите дробное число: ");
                    String input = scanner.nextLine();
                    number = Float.parseFloat(input);
                    isValidInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод. Пожалуйста, введите дробное число.");
                }
            }

            return number;
        }

        public static void main(String[] args) {
            float userInput = getUserInput();
            System.out.println("Введенное число: " + userInput);
        }
    }
}