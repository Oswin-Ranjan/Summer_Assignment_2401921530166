class Box {
    protected double length;
    protected double breadth;

    public Box() {
        this(0, 0);
    }

    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setValue(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}

class Box3D extends Box {
    protected double height;

    public Box3D() {
        this(0, 0, 0);
    }

    public Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public void setValue(double length, double breadth, double height) {
        super.setValue(length, breadth);
        this.height = height;
    }

    public double volume() {
        return length * breadth * height;
    }

}

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box(5, 4);
        System.out.println("Box area: " + box.area());

        Box3D box3D = new Box3D(5, 4, 3);
        System.out.println("Box3D volume: " + box3D.volume());
    }
}