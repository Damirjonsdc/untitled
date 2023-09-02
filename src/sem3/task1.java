package sem3;

public class task1 {
        public static void main(String[] args) {
            try {
                doSomething();
            } catch (CustomCheckedException e) {
                System.out.println("Исключение обработано: " + e.getMessage());
            }
        }

        public static void doSomething() throws CustomCheckedException {
            // Исключение может быть выброшено в этом методе
            throw new CustomCheckedException("Произошла ошибка в методе doSomething()");
        }
    }

    class CustomCheckedException extends Exception {
        public CustomCheckedException(String message) {
            super(message);
        }
    }
