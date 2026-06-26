class Outer {
    public void display() {
        System.out.println("Display method of outer class");
    }

    class inner {
        public void display() {
            System.out.println("Display method of inner class");
        }
    }
}

public class OuterInnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();

        Outer.inner innerObject = outer.new inner();
        innerObject.display();
    }
}