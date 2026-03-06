interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class Point implements Movable {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() { y++; }
    public void moveDown() { y--; }
    public void moveLeft() { x--; }
    public void moveRight() { x++; }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

class Circle implements Movable {
    Point center;
    int radius;

    Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public void moveUp() { center.moveUp(); }
    public void moveDown() { center.moveDown(); }
    public void moveLeft() { center.moveLeft(); }
    public void moveRight() { center.moveRight(); }

    public String toString() {
        return "Center: " + center + " Radius: " + radius;
    }
}

public class ex6abd {
    public static void main(String[] args) {

        Point p = new Point(2,3);
        p.moveUp();
        p.moveRight();
        System.out.println(p);

        Circle c = new Circle(new Point(5,5), 10);
        c.moveLeft();
        c.moveDown();
        System.out.println(c);
    }
}