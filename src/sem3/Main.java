package sem3;

public class Main {
    public static void main(String[] args) {
            try {
                int result = divideNumbers(10, 0);
                System.out.println(result);
            } catch (DivisionByZeroException e) {
                System.out.println(e.getMessage());
            }
        }

        public static int divideNumbers(int a, int b) throws DivisionByZeroException {
            if (b == 0) {
                throw new DivisionByZeroException("Ошибка деления на ноль: нельзя делить число на ноль!");
            }
            return a / b;
        }

        public static class DivisionByZeroException extends Exception {
            public DivisionByZeroException(String message) {
                super(message);
            }
        }
    }
