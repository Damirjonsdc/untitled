package sem3;
import java.io.IOException;
public class counter implements AutoCloseable {
    private int count;

        public counter() {
            this.count = 0;
        }

        public void add() throws IOException {
            if (isClosed()) {
                throw new IOException("Ресурс закрыт");
            }
            count++;
        }

        @Override
        public void close() {
            count = -1;
        }

        public boolean isClosed() {
            return count == -1;
        }

        public int getCount() {
            return count;
        }

        public static void main(String[] args) {
            try (counter counter = new counter()) {
                counter.add();
                System.out.println("Value: " + counter.getCount());
            } catch (IOException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }