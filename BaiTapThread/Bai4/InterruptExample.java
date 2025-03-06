class InterruptExample {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            while (true) {
                try {
                    System.out.println("Worker is running...");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Worker thread interrupted!");
                    break; // Thoát khỏi vòng lặp khi bị gián đoạn
                }
            }
            System.out.println("Worker stopped.");
        });

        worker.start();
        Thread.sleep(3000);
        worker.interrupt();
    }
}
