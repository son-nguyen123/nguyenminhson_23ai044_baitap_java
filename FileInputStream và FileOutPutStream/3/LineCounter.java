import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {
    public static void main(String[] args) {
        String fileName = "input.txt"; // Tên file cần đếm số dòng
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) { // Đọc từng dòng cho đến hết file
                lineCount++;
            }
            System.out.println("Số dòng trong file '" + fileName + "' là: " + lineCount);
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
