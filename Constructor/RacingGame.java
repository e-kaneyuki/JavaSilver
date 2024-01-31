import java.util.Scanner;

public class EnhancedRacingGame {
    public static void main(String[] args) {
        final int ROAD_WIDTH = 10;
        int playerPosition = ROAD_WIDTH / 2;
        int obstaclePosition = (int) (Math.random() * ROAD_WIDTH);

        Scanner scanner = new Scanner(System.in);

        boolean isGameOver = false;
        int score = 0;

        while (!isGameOver) {
            displayRoad(ROAD_WIDTH, playerPosition, obstaclePosition);

            System.out.print("Move left (L) or right (R): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("L") && playerPosition > 0) {
                playerPosition--;
            } else if (input.equalsIgnoreCase("R") && playerPosition < ROAD_WIDTH - 1) {
                playerPosition++;
            }

            // Move obstacle down
            obstaclePosition++;
            if (obstaclePosition >= ROAD_WIDTH) {
                obstaclePosition = 0;
                score++;
            }

            // Clear the console
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Check for collision
            if (playerPosition == obstaclePosition) {
                isGameOver = true;
                System.out.println("Game Over! Your score: " + score);
            }
        }

        scanner.close();
    }

    public static void displayRoad(int roadWidth, int playerPosition, int obstaclePosition) {
        for (int i = 0; i < roadWidth; i++) {
            if (i == playerPosition) {
                System.out.print("^");
            } else if (i == obstaclePosition) {
                System.out.print("*");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
    }
}
