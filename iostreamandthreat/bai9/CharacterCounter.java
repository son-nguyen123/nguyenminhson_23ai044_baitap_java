import java.io.*;

public class CharacterCounter {
    static class CounterThread extends Thread {
        private String inputFile;
        private String outputFile;

        public CounterThread(String inputFile, String outputFile) {
            this.inputFile = inputFile;
            this.outputFile = outputFile;
        }

        @Override
        public void run() {
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

                int totalCharacters = 0;
                String line;

                while ((line = reader.readLine()) != null) {
                    totalCharacters += line.length(); // Đếm số ký tự trong dòng
                }

                // Ghi kết quả vào file đích
                writer.write("Số ký tự trong file: " + totalCharacters);
                System.out.println("Hoàn tất: Kết quả đã ghi vào " + outputFile);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String inputFile = "source.txt"; // File nguồn
        String outputFile = "result.txt"; // File kết quả

        CounterThread counterThread = new CounterThread(inputFile, outputFile);
        counterThread.start(); // Bắt đầu Thread

        try {
            counterThread.join(); // Đợi Thread hoàn tất
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
