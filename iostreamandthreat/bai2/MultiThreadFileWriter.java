import java.io.FileWriter;
import java.io.IOException;

class FileWriterThread extends Thread {
    private String filePath;
    private String content;

    public FileWriterThread(String filePath, String content) {
        this.filePath = filePath;
        this.content = content;
    }

    @Override
    public void run() {
        synchronized (FileWriterThread.class) { // Đồng bộ hóa để tránh xung đột
            try (FileWriter writer = new FileWriter(filePath, true)) {
                writer.write(content + "\n");
                System.out.println(Thread.currentThread().getName() + " đã ghi: " + content);
                Thread.sleep(500); // Tạm dừng để minh họa
            } catch (IOException | InterruptedException e) {
                System.err.println("Lỗi: " + e.getMessage());
            }
        }
    }
}

public class MultiThreadFileWriter {
    public static void main(String[] args) {
        String filePath = "output.txt"; // Đường dẫn tới file đầu ra

        // Tạo hai thread, mỗi thread ghi một nội dung khác nhau
        FileWriterThread thread1 = new FileWriterThread(filePath, "Thread 1: Xin chào!");
        FileWriterThread thread2 = new FileWriterThread(filePath, "Thread 2: Chúc bạn học tốt!");

        // Bắt đầu các thread
        thread1.start();
        thread2.start();
    }
}
