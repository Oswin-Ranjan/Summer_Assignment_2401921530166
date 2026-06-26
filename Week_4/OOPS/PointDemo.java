class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point(x, y) = (" + x + ", " + y + ")");
    }
}

public class PointDemo {
    public static void main(String[] args) {
        Point firstPoint = new Point();
        firstPoint.display();

        Point secondPoint = new Point(10, 20);
        secondPoint.display();

        secondPoint.setXY(30, 40);
        secondPoint.display();
    }
}