package sem3;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class homework {
    public static void main(String[] args) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите данные в формате: Фамилия Имя Отчество ДатаРождения НомерТелефона Пол");
                String input = scanner.nextLine().trim();

                String[] data = input.split("\\s+");
                if (data.length != 6) {
                    throw new IllegalArgumentException("Введено неверное количество данных");
                }

                String surname = data[0];
                String name = data[1];
                String patronymic = data[2];
                String birthDate = data[3];
                String phoneNumber = data[4];
                String gender = data[5];

                if (!isValidDate(birthDate)) {
                    throw new IllegalArgumentException("Неверный формат даты рождения (dd.mm.yyyy)");
                }

                if (!isValidPhoneNumber(phoneNumber)) {
                    throw new IllegalArgumentException("Неверный формат номера телефона");
                }

                if (!isValidGender(gender)) {
                    throw new IllegalArgumentException("Неверный формат пола (f или m)");
                }

                String filename = surname + ".txt";
                String userData = surname + name + patronymic + birthDate + " " + phoneNumber + gender;

                FileWriter fileWriter = new FileWriter(filename, true);
                fileWriter.write(userData + "\n");
                fileWriter.close();

                System.out.println("Данные успешно записаны в файл " + filename);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Ошибка при чтении-записи файла: " + e.getMessage());
                e.printStackTrace();
            }
        }

        private static boolean isValidDate(String date) {
            return date.matches("\\d{2}\\.\\d{2}\\.\\d{4}");
        }

        private static boolean isValidPhoneNumber(String phoneNumber) {
            return phoneNumber.matches("\\d+");
        }

        private static boolean isValidGender(String gender) {
            return gender.matches("[fm]");
        }
    }
