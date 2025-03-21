import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class LoggerThread extends Thread {
    private String logFile;
    private BlockingQueue<String> logQueue;
    private volatile boolean running = true;

    public LoggerThread(String logFile) {
        this.logFile = logFile;
        this.logQueue = new LinkedBlockingQueue<>();
    }

    public void log(String message) {
        try {
            logQueue.put(message); // Thêm thông điệp vào hàng đợi
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void stopLogging() {
        running = false; // Dừng Thread ghi log
        log("END"); // Đánh dấu kết thúc
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            while (running || !logQueue.isEmpty()) {
                String message = logQueue.take(); // Lấy thông điệp từ hàng đợi
                if ("END".equals(message)) break;

                String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                writer.write("[" + timestamp + "] " + message);
                writer.newLine(); // Xuống dòng
                System.out.println("Đã ghi log: " + message);
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Lỗi khi ghi log: " + e.getMessage());
        }
    }
}

public class LogWriterWithThread {
    public static void main(String[] args) throws InterruptedException {
        String logFile = "log.txt";
        LoggerThread logger = new LoggerThread(logFile);
        logger.start();

        // Ghi log
        logger.log("Hệ thống khởi động.");
        Thread.sleep(1000); // Tạm dừng 1 giây
        logger.log("Đang thực hiện tác vụ...");
        Thread.sleep(1000);
        logger.log("Hoàn tất tác vụ.");
        Thread.sleep(1000);

        // Dừng LoggerThread
        logger.stopLogging();
        logger.join(); // Đợi Thread hoàn tất
        System.out.println("Ghi log hoàn tất.");
    }
}
