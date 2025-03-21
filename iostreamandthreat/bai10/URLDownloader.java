import java.io.*;
import java.net.URL;

public class URLDownloader {
    static class DownloadThread extends Thread {
        private String urlString;
        private String outputFile;

        public DownloadThread(String urlString, String outputFile) {
            this.urlString = urlString;
            this.outputFile = outputFile;
        }

        @Override
        public void run() {
            try (BufferedInputStream inputStream = new BufferedInputStream(new URL(urlString).openStream());
                 FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {

                byte[] buffer = new byte[1024];
                int bytesRead;

                System.out.println("Đang tải dữ liệu từ: " + urlString);
                while ((bytesRead = inputStream.read(buffer, 0, 1024)) != -1) {
                    fileOutputStream.write(buffer, 0, bytesRead);
                }
                System.out.println("Tải thành công và lưu vào file: " + outputFile);

            } catch (Exception e) {
                System.err.println("Lỗi khi tải dữ liệu từ URL: " + urlString);
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String urlString = "https://www.example.com"; // Thay bằng URL cần tải
        String outputFile = "output.html"; // File để lưu dữ liệu tải về

        DownloadThread downloadThread = new DownloadThread(urlString, outputFile);
        downloadThread.start(); // Bắt đầu Thread

        try {
            downloadThread.join(); // Đợi Thread hoàn thành
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
