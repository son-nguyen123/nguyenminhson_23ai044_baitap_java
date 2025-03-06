class VisibilityExample {
    private static boolean flag = false;

    public static synchronized boolean getFlag() {
        return flag;
    }

    public static synchronized void setFlag(boolean value) {
        flag = value;
    }

    public static void main(String[] args) {
        new Thread(() -> {
            while (!getFlag()) {}
            System.out.println("Flag changed!");
        }).start();

        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        setFlag(true);
    }
}
