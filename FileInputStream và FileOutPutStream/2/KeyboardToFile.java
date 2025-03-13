import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardToFile {
    public static void main(String[] args) {
        String fileName = "output.txt"; // Tên file để lưu dữ liệu

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(fileName)) {

            System.out.println("Nhập dữ liệu (gõ 'exit' để kết thúc):");

            String line;
            while (true) {
                line = reader.readLine(); // Đọc dòng nhập từ bàn phím
                if ("exit".equalsIgnoreCase(line)) { // Nếu nhập "exit" thì dừng lại
                    break;
                }
                writer.write(line + System.lineSeparator()); // Ghi vào file
            }

            System.out.println("Dữ liệu đã được lưu vào " + fileName);
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
}
