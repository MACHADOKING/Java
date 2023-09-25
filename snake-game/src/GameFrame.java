import javax.swing.*;

import com.sun.javafx.scene.paint.GradientUtils.Point;
import com.sun.javafx.scene.traversal.Direction;

import java.awt.event.*;

public class GameFrame extends JFrame {
    private Snake snake;

    public GameFrame() {
        snake = new Snake(3, new Point(10, 10));

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                Direction newDirection = null;

                switch (key) {
                    case KeyEvent.VK_UP:
                    case KeyEvent.VK_W:
                        newDirection = Direction.UP;
                        break;
                    case KeyEvent.VK_DOWN:
                    case KeyEvent.VK_S:
                        newDirection = Direction.DOWN;
                        break;
                    case KeyEvent.VK_LEFT:
                    case KeyEvent.VK_A:
                        newDirection = Direction.LEFT;
                        break;
                    case KeyEvent.VK_RIGHT:
                    case KeyEvent.VK_D:
                        newDirection = Direction.RIGHT;
                        break;
                }

                if (newDirection != null) {
                    snake.setDirection(newDirection);
                }
            }
        });

        setTitle("Snake Game");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new GamePanel(snake, food));

        initializeGame();
    }

    private void initializeGame() {
        snake = new Snake(3, new Point(10, 10));

        createFood();

        Thread gameThread = new Thread(() -> {
            while(true) {
                snake.move();

                if(checkCollision()) {
                    gameOver();
                    break;
                }

                if(snakeAteFood()) {
                    incrementScore();
                    createFood();
                }
                repaint();

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        gameThread.start();
    }

    public staticvoid main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GameFrame game = new GameFrame();
            game.setVisible(true);
        });
    }
}
