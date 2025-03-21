import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileReaderThread extends Thread {
    private String filePath;

    public FileReaderThread(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(Thread.currentThread().getName() + ": " + line);
                // Tạm dừng để minh họa việc xử lý từng dòng
                Thread.sleep(500);
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
    }
}

public class FileReaderWithThread {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Đường dẫn tới file cần đọc

        FileReaderThread thread = new FileReaderThread(filePath);
        thread.start();
    }
}
