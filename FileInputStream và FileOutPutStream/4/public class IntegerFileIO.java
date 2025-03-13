import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IntegerFileIO {
    public static void main(String[] args) {
        String fileName = "numbers.dat"; // Tệp nhị phân để lưu số nguyên

        // Ghi danh sách số nguyên vào file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            int[] numbers = {10, 20, 30, 40, 50};

            for (int num : numbers) {
                dos.writeInt(num); // Ghi từng số nguyên vào file
            }
            System.out.println("Ghi danh sách số nguyên vào file thành công.");
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }

        // Đọc lại danh sách số nguyên từ file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("Danh sách số nguyên đọc từ file:");

            while (dis.available() > 0) { // Kiểm tra còn dữ liệu để đọc
                int num = dis.readInt(); // Đọc từng số nguyên
                System.out.print(num + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
