import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class KeyboardToFileThread extends Thread {
    private String fileName;

    public KeyboardToFileThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Nhập dữ liệu (gõ 'exit' để thoát):");

            while (true) {
                String input = scanner.nextLine();
                if ("exit".equalsIgnoreCase(input)) { // Kiểm tra điều kiện thoát
                    break;
                }
                writer.write(input); // Ghi dữ liệu vào file
                writer.newLine();
                writer.flush(); // Đảm bảo dữ liệu được ghi ngay lập tức
                System.out.println("Đã ghi: " + input);
            }

            System.out.println("Dừng ghi dữ liệu. Đã thoát chương trình.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class KeyboardToFile {
    public static void main(String[] args) {
        String fileName = "output.txt"; // File sẽ lưu dữ liệu
        KeyboardToFileThread writerThread = new KeyboardToFileThread(fileName);

        writerThread.start(); // Khởi chạy Thread
        try {
            writerThread.join(); // Đợi Thread hoàn tất
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hoàn tất chương trình.");
    }
}
