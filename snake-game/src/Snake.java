import java.util.ArrayList;
import java.util.List;

import com.sun.javafx.scene.traversal.Direction;
import com.sun.javafx.scene.paint.GradientUtils.Point;

import javafx.scene.effect.Light.Point;

public class Snake {
    private List<Point> body;
    private int size;
    private Direction direction;

    public Snake(int initialSize, Point initialPosition) {
        this.size = initialSize;
        this.body = new ArrayList<>();
        this.direction = Direction.RIGHT;

        for (int i = 0; i < initialSize; i++) {
            body.add(new Point(initialPosition.x - i, initialPosition.y));
        }
    }

    public List<Point> getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction newDirection) {
        if (newDirection != direction.opposite()) {
            direction = newDirection;
        }
    }

    public void move() {
        Point newHead = getNextHeadPosition();
        body.add(0, newHead);
        if (body.size() > size) {
            body.remove(body.size() - 1);
        }
    }

    private Point getNextHeadPosition() {
        Point head = body.get(0);
        int x = head.x;
        int y = head.y;

        switch (direction) {
            case UP:
                y--;
                break;
            case DOWN:
                y++;
                break;
            case LEFT:
                x--;
                break;
            case RIGHT:
                x++;
                break;

        }
        return new Point(x, y);
    }
}
