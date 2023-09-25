import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GamePanel extends JPanel {
    private Snake snake;
    private Food food;

    public GamePanel(Snake snake, Food food) {
        this.snake = snake;
        this.food = food;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.clearRect(0, 0, getWidth(), getHeight());

        drawSnake(g);

        drawFood(g);
    }

    private void drawSnake(Graphics g) {
        List<Point> body = snake.getBody();
        g.setColor(Color.GREEN);

        for (Point segment : body) {
            g.fillRect(segment.x * 20, segment.y * 20, 20, 20);
        }
    }

    private void drawFood(Graphics g) {
        Point foodPosition = food.getPosition();
        g.setColor(Color.RED);
        g.fillOval(foodPosition.x * 20, foodPosition.y * 20, 20, 20);
    }

}
