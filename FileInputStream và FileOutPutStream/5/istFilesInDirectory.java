import java.io.File;

public class ListFilesInDirectory {
    public static void main(String[] args) {
        // Thay đổi đường dẫn thư mục theo nhu cầu
        String directoryPath = "C:\\Users\\Public\\Documents"; 

        File directory = new File(directoryPath);

        // Kiểm tra xem đường dẫn có phải là thư mục không
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles(); // Lấy danh sách tệp

            if (files != null && files.length > 0) {
                System.out.println("Danh sách các tệp trong thư mục: " + directoryPath);
                for (File file : files) {
                    System.out.println(file.getName()); // In tên tệp
                }
            } else {
                System.out.println("Thư mục trống.");
            }
        } else {
            System.out.println("Thư mục không tồn tại hoặc không hợp lệ.");
        }
    }
}
