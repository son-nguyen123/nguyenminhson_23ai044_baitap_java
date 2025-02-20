import java.util.Random;

class Ball {
    private int x, y;

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int xDelta, int yDelta) {
        this.x += xDelta;
        this.y += yDelta;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    @Override
    public String toString() {
        return "Ball at (" + x + ", " + y + ")";
    }
}

class Player {
    private String name;
    private int x, y;

    public Player(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void move(int xDelta, int yDelta) {
        this.x += xDelta;
        this.y += yDelta;
    }

    public void kick(Ball ball, int xTarget, int yTarget) {
        ball.setPosition(xTarget, yTarget);
        System.out.println(name + " kicked the ball to (" + xTarget + ", " + yTarget + ")");
    }

    @Override
    public String toString() {
        return name + " at (" + x + ", " + y + ")";
    }
}

public class SoccerGame {
    public static void main(String[] args) {
        // Create a ball in the center of the field
        Ball ball = new Ball(50, 25);

        // Create two teams of players
        Player playerA1 = new Player("Alice (Team A)", 40, 20);
        Player playerA2 = new Player("Alex (Team A)", 30, 10);
        Player playerB1 = new Player("Bob (Team B)", 60, 30);
        Player playerB2 = new Player("Ben (Team B)", 70, 40);

        Player[] players = {playerA1, playerA2, playerB1, playerB2};
        Random random = new Random();

        System.out.println("Game Start!");
        System.out.println(ball);

        // Simulate 10 moves
        for (int i = 0; i < 10; i++) {
            Player currentPlayer = players[random.nextInt(players.length)];
            int newX = random.nextInt(101); // Random position within field (0-100)
            int newY = random.nextInt(51);  // Random position within field (0-50)

            currentPlayer.kick(ball, newX, newY);
            System.out.println(ball);
        }

        System.out.println("Game Over!");
    }
}
