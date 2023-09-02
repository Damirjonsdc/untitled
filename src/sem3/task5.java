package sem3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
            try {
                File file = new File("path/to/nonexistent/file.txt");
                Scanner scanner = new Scanner(file);
                System.out.println("Файл успешно открыт");
            } catch (FileNotFoundException e) {
                System.out.println("Ошибка: файл не найден или не может быть открыт");
            }
        }
    }
